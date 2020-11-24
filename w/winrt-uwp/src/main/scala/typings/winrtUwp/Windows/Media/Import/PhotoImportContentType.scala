package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportContentType extends js.Object
/** Specifies the content type of an imported item. */
@JSGlobal("Windows.Media.Import.PhotoImportContentType")
@js.native
object PhotoImportContentType extends js.Object {
  
  /** The item is an image. */
  @js.native
  sealed trait image extends PhotoImportContentType
  
  /** The content type is unknown. */
  @js.native
  sealed trait unknown extends PhotoImportContentType
  
  /** The item is a video. */
  @js.native
  sealed trait video extends PhotoImportContentType
}
