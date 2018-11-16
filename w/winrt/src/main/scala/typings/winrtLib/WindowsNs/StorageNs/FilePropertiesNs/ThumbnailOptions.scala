package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailOptions extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
@js.native
object ThumbnailOptions extends js.Object {
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  @js.native
  sealed trait resizeThumbnail
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  @js.native
  sealed trait returnOnlyIfCached
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  @js.native
  sealed trait useCurrentScale
    extends winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions
  
  val none: none with java.lang.String = js.native
  val resizeThumbnail: resizeThumbnail with java.lang.String = js.native
  val returnOnlyIfCached: returnOnlyIfCached with java.lang.String = js.native
  val useCurrentScale: useCurrentScale with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions with java.lang.String
  ] = js.native
}

