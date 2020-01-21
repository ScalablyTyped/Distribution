package typings.winrtUwp.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailMode with Double] = js.native
  /* 3 */ @js.native
  object documentsView extends TopLevel[documentsView with Double]
  
  /* 4 */ @js.native
  object listView extends TopLevel[listView with Double]
  
  /* 2 */ @js.native
  object musicView extends TopLevel[musicView with Double]
  
  /* 0 */ @js.native
  object picturesView extends TopLevel[picturesView with Double]
  
  /* 5 */ @js.native
  object singleItem extends TopLevel[singleItem with Double]
  
  /* 1 */ @js.native
  object videosView extends TopLevel[videosView with Double]
  
}

