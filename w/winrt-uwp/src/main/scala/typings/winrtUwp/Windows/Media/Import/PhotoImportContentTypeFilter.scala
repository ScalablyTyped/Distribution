package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
