package typings.winrt.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageDeleteOption extends js.Object

@JSGlobal("Windows.Storage.StorageDeleteOption")
@js.native
object StorageDeleteOption extends js.Object {
  @js.native
  sealed trait default extends StorageDeleteOption
  
  @js.native
  sealed trait permanentDelete extends StorageDeleteOption
  
  /* 0 */ val default: typings.winrt.WindowsNs.StorageNs.StorageDeleteOption.default with Double = js.native
  /* 1 */ val permanentDelete: typings.winrt.WindowsNs.StorageNs.StorageDeleteOption.permanentDelete with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageDeleteOption with Double] = js.native
}

