package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailType extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
@js.native
object ThumbnailType extends js.Object {
  @js.native
  sealed trait icon extends ThumbnailType
  
  @js.native
  sealed trait image extends ThumbnailType
  
  /* 1 */ val icon: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType.icon with Double = js.native
  /* 0 */ val image: typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ThumbnailType.image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailType with Double] = js.native
}

