package typings.winrt.Windows.Storage.FileProperties

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
  
  /* 1 */ val icon: typings.winrt.Windows.Storage.FileProperties.ThumbnailType.icon with Double = js.native
  /* 0 */ val image: typings.winrt.Windows.Storage.FileProperties.ThumbnailType.image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailType with Double] = js.native
}

