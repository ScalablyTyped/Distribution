package typings.winrtUwp.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you create a new file or folder. */
@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends js.Object {
  /* 2 */ val failIfExists: typings.winrtUwp.Windows.Storage.CreationCollisionOption.failIfExists with Double = js.native
  /* 0 */ val generateUniqueName: typings.winrtUwp.Windows.Storage.CreationCollisionOption.generateUniqueName with Double = js.native
  /* 3 */ val openIfExists: typings.winrtUwp.Windows.Storage.CreationCollisionOption.openIfExists with Double = js.native
  /* 1 */ val replaceExisting: typings.winrtUwp.Windows.Storage.CreationCollisionOption.replaceExisting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.CreationCollisionOption with Double] = js.native
}

