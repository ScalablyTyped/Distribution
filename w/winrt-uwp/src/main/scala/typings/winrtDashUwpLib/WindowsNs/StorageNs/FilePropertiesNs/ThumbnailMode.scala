package typings
package winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs

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
  sealed trait documentsView
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  /** To display previews of files (or other items) in a list. */
  @js.native
  sealed trait listView
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  /** To display previews of music files. */
  @js.native
  sealed trait musicView
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  /** To display previews of picture files. */
  @js.native
  sealed trait picturesView
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  /** To display a preview of any single item (like a file, folder, or file group). */
  @js.native
  sealed trait singleItem
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  /** To display previews of video files. */
  @js.native
  sealed trait videosView
    extends winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  val documentsView: documentsView with java.lang.String = js.native
  val listView: listView with java.lang.String = js.native
  val musicView: musicView with java.lang.String = js.native
  val picturesView: picturesView with java.lang.String = js.native
  val singleItem: singleItem with java.lang.String = js.native
  val videosView: videosView with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode with java.lang.String
  ] = js.native
}

