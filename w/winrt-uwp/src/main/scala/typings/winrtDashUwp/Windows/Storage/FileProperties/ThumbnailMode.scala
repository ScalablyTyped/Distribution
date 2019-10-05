package typings.winrtDashUwp.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailMode extends js.Object

/** Describes the purpose of the thumbnail to determine how to adjust the thumbnail image to retrieve. */
@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends js.Object {
  /** To display previews of document files. */
  @js.native
  sealed trait documentsView extends ThumbnailMode
  
  /** To display previews of files (or other items) in a list. */
  @js.native
  sealed trait listView extends ThumbnailMode
  
  /** To display previews of music files. */
  @js.native
  sealed trait musicView extends ThumbnailMode
  
  /** To display previews of picture files. */
  @js.native
  sealed trait picturesView extends ThumbnailMode
  
  /** To display a preview of any single item (like a file, folder, or file group). */
  @js.native
  sealed trait singleItem extends ThumbnailMode
  
  /** To display previews of video files. */
  @js.native
  sealed trait videosView extends ThumbnailMode
  
  /* 3 */ val documentsView: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode.documentsView with Double = js.native
  /* 4 */ val listView: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode.listView with Double = js.native
  /* 2 */ val musicView: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode.musicView with Double = js.native
  /* 0 */ val picturesView: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode.picturesView with Double = js.native
  /* 5 */ val singleItem: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode.singleItem with Double = js.native
  /* 1 */ val videosView: typings.winrtDashUwp.Windows.Storage.FileProperties.ThumbnailMode.videosView with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailMode with Double] = js.native
}

