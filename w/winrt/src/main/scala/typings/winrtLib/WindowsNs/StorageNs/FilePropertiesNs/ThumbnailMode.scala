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
  
  val documentsView: documentsView with java.lang.String = js.native
  val listView: listView with java.lang.String = js.native
  val musicView: musicView with java.lang.String = js.native
  val picturesView: picturesView with java.lang.String = js.native
  val singleItem: singleItem with java.lang.String = js.native
  val videosView: videosView with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailMode with java.lang.String
  ] = js.native
}

