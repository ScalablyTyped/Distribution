package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportContentType extends StObject
/** Specifies the content type of an imported item. */
@JSGlobal("Windows.Media.Import.PhotoImportContentType")
@js.native
object PhotoImportContentType extends StObject {
  
  /** The item is an image. */
  @js.native
  sealed trait image
    extends StObject
       with PhotoImportContentType
  
  /** The content type is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with PhotoImportContentType
  
  /** The item is a video. */
  @js.native
  sealed trait video
    extends StObject
       with PhotoImportContentType
}
