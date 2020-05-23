package typings.winrtUwp.Windows.Storage

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
  
}

