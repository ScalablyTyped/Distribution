package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailMode extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends js.Object {
  @js.native
  sealed trait documentsView extends ThumbnailMode
  
  @js.native
  sealed trait listView extends ThumbnailMode
  
  @js.native
  sealed trait musicView extends ThumbnailMode
  
  @js.native
  sealed trait picturesView extends ThumbnailMode
  
  @js.native
  sealed trait singleItem extends ThumbnailMode
  
  @js.native
  sealed trait videosView extends ThumbnailMode
  
  /* 3 */ val documentsView: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode.documentsView with Double = js.native
  /* 4 */ val listView: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode.listView with Double = js.native
  /* 2 */ val musicView: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode.musicView with Double = js.native
  /* 0 */ val picturesView: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode.picturesView with Double = js.native
  /* 5 */ val singleItem: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode.singleItem with Double = js.native
  /* 1 */ val videosView: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode.videosView with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailMode with Double] = js.native
}

