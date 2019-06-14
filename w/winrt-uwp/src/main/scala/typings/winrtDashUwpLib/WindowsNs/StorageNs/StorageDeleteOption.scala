package typings
package winrtDashUwpLib.WindowsNs.StorageNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageDeleteOption
  
  /** Permanently deletes the item. The item is not moved to the Recycle Bin. */
  @js.native
  sealed trait permanentDelete
    extends winrtDashUwpLib.WindowsNs.StorageNs.StorageDeleteOption
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val permanentDelete: permanentDelete with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StorageDeleteOption with scala.Double] = js.native
}

