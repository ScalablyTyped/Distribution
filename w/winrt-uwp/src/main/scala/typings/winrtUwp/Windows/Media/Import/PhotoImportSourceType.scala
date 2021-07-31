package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportSourceType extends StObject
/** Specifies the type of device that is being used as a photo import source. */
@JSGlobal("Windows.Media.Import.PhotoImportSourceType")
@js.native
object PhotoImportSourceType extends StObject {
  
  /** The device is an audio recorder. */
  @js.native
  sealed trait audioRecorder
    extends StObject
       with PhotoImportSourceType
  
  /** The device is a camera. */
  @js.native
  sealed trait camera
    extends StObject
       with PhotoImportSourceType
  
  /** The device is a generic photo import source. */
  @js.native
  sealed trait generic
    extends StObject
       with PhotoImportSourceType
  
  /** The device is a media player. */
  @js.native
  sealed trait mediaPlayer
    extends StObject
       with PhotoImportSourceType
  
  /** The device is a personal information manager. */
  @js.native
  sealed trait personalInfoManager
    extends StObject
       with PhotoImportSourceType
  
  /** The device is a phone. */
  @js.native
  sealed trait phone
    extends StObject
       with PhotoImportSourceType
  
  /** The device is a video camera. */
  @js.native
  sealed trait video
    extends StObject
       with PhotoImportSourceType
}
