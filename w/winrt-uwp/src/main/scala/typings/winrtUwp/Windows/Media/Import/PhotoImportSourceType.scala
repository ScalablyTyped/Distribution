package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportSourceType extends js.Object
/** Specifies the type of device that is being used as a photo import source. */
@JSGlobal("Windows.Media.Import.PhotoImportSourceType")
@js.native
object PhotoImportSourceType extends js.Object {
  
  /** The device is an audio recorder. */
  @js.native
  sealed trait audioRecorder extends PhotoImportSourceType
  
  /** The device is a camera. */
  @js.native
  sealed trait camera extends PhotoImportSourceType
  
  /** The device is a generic photo import source. */
  @js.native
  sealed trait generic extends PhotoImportSourceType
  
  /** The device is a media player. */
  @js.native
  sealed trait mediaPlayer extends PhotoImportSourceType
  
  /** The device is a personal information manager. */
  @js.native
  sealed trait personalInfoManager extends PhotoImportSourceType
  
  /** The device is a phone. */
  @js.native
  sealed trait phone extends PhotoImportSourceType
  
  /** The device is a video camera. */
  @js.native
  sealed trait video extends PhotoImportSourceType
}
