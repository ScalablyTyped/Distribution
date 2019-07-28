package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailOptions extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
@js.native
object ThumbnailOptions extends js.Object {
  @js.native
  sealed trait none extends ThumbnailOptions
  
  @js.native
  sealed trait resizeThumbnail extends ThumbnailOptions
  
  @js.native
  sealed trait returnOnlyIfCached extends ThumbnailOptions
  
  @js.native
  sealed trait useCurrentScale extends ThumbnailOptions
  
  /* 0 */ val none: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions.none with Double = js.native
  /* 2 */ val resizeThumbnail: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions.resizeThumbnail with Double = js.native
  /* 1 */ val returnOnlyIfCached: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions.returnOnlyIfCached with Double = js.native
  /* 3 */ val useCurrentScale: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailOptions.useCurrentScale with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailOptions with Double] = js.native
}

