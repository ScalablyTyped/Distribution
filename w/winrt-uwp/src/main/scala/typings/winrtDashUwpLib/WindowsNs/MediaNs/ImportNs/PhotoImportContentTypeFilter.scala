package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportContentTypeFilter extends js.Object

/** Specifies the content types that are included in a photo import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportContentTypeFilter")
@js.native
object PhotoImportContentTypeFilter extends js.Object {
  /** Include images and videos. */
  @js.native
  sealed trait imagesAndVideos
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentTypeFilter
  
  /** Include only images. */
  @js.native
  sealed trait onlyImages
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentTypeFilter
  
  /** Include only videos. */
  @js.native
  sealed trait onlyVideos
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentTypeFilter
  
  val imagesAndVideos: imagesAndVideos with java.lang.String = js.native
  val onlyImages: onlyImages with java.lang.String = js.native
  val onlyVideos: onlyVideos with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentTypeFilter with java.lang.String
  ] = js.native
}

