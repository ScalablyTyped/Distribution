package typings.winrtDashUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageDeleteOption extends js.Object

/** Specifies whether a deleted item is moved to the Recycle Bin or permanently deleted. */
@JSGlobal("Windows.Storage.StorageDeleteOption")
@js.native
object StorageDeleteOption extends js.Object {
  /** Specifies the default behavior. */
  @js.native
  sealed trait default extends StorageDeleteOption
  
  /** Permanently deletes the item. The item is not moved to the Recycle Bin. */
  @js.native
  sealed trait permanentDelete extends StorageDeleteOption
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Storage.StorageDeleteOption.default with Double = js.native
  /* 1 */ val permanentDelete: typings.winrtDashUwp.Windows.Storage.StorageDeleteOption.permanentDelete with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageDeleteOption with Double] = js.native
}

