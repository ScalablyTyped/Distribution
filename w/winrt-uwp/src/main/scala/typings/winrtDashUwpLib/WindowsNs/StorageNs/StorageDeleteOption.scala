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
  
  val default: default with java.lang.String = js.native
  val permanentDelete: permanentDelete with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.StorageDeleteOption with java.lang.String] = js.native
}

