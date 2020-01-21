package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportContentTypeFilter with Double] = js.native
  /* 2 */ @js.native
  object imagesAndVideos extends TopLevel[imagesAndVideos with Double]
  
  /* 0 */ @js.native
  object onlyImages extends TopLevel[onlyImages with Double]
  
  /* 1 */ @js.native
  object onlyVideos extends TopLevel[onlyVideos with Double]
  
}

