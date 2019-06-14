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
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val resizeThumbnail: resizeThumbnail with scala.Double = js.native
  /* 1 */ val returnOnlyIfCached: returnOnlyIfCached with scala.Double = js.native
  /* 3 */ val useCurrentScale: useCurrentScale with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions with scala.Double] = js.native
}

