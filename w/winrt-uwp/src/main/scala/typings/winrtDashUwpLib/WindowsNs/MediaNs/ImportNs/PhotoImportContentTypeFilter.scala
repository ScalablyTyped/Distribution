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
  
  /* 2 */ val imagesAndVideos: imagesAndVideos with scala.Double = js.native
  /* 0 */ val onlyImages: onlyImages with scala.Double = js.native
  /* 1 */ val onlyVideos: onlyVideos with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportContentTypeFilter with scala.Double
  ] = js.native
}

