package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportContentType extends js.Object

/** Specifies the content type of an imported item. */
@JSGlobal("Windows.Media.Import.PhotoImportContentType")
@js.native
object PhotoImportContentType extends js.Object {
  /** The item is an image. */
  @js.native
  sealed trait image
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentType
  
  /** The content type is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentType
  
  /** The item is a video. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentType
  
  val image: image with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentType with java.lang.String
  ] = js.native
}

