package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailMode extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends js.Object {
  @js.native
  sealed trait documentsView
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  @js.native
  sealed trait listView
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  @js.native
  sealed trait musicView
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  @js.native
  sealed trait picturesView
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  @js.native
  sealed trait singleItem
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  @js.native
  sealed trait videosView
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode
  
  /* 3 */ val documentsView: documentsView with scala.Double = js.native
  /* 4 */ val listView: listView with scala.Double = js.native
  /* 2 */ val musicView: musicView with scala.Double = js.native
  /* 0 */ val picturesView: picturesView with scala.Double = js.native
  /* 5 */ val singleItem: singleItem with scala.Double = js.native
  /* 1 */ val videosView: videosView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode with scala.Double] = js.native
}

