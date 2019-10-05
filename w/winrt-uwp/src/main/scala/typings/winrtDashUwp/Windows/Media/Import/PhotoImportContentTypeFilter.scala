package typings.winrtDashUwp.Windows.Media.Import

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
  sealed trait imagesAndVideos extends PhotoImportContentTypeFilter
  
  /** Include only images. */
  @js.native
  sealed trait onlyImages extends PhotoImportContentTypeFilter
  
  /** Include only videos. */
  @js.native
  sealed trait onlyVideos extends PhotoImportContentTypeFilter
  
  /* 2 */ val imagesAndVideos: typings.winrtDashUwp.Windows.Media.Import.PhotoImportContentTypeFilter.imagesAndVideos with Double = js.native
  /* 0 */ val onlyImages: typings.winrtDashUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyImages with Double = js.native
  /* 1 */ val onlyVideos: typings.winrtDashUwp.Windows.Media.Import.PhotoImportContentTypeFilter.onlyVideos with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportContentTypeFilter with Double] = js.native
}

