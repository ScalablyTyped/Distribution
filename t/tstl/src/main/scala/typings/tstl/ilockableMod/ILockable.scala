package typings.tstl.ilockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockable extends js.Object {
  /**
    * Lock until be unlocked.
    */
  def lock(): js.Promise[Unit]
  /**
    * Try {@link lock}.
    *
    * @return Whether succeeded to lock or not.
    */
  def try_lock(): js.Promise[Boolean]
  /**
    * Unlock.
    */
  def unlock(): js.Promise[Unit]
}

object ILockable {
  @scala.inline
  def apply(lock: () => js.Promise[Unit], try_lock: () => js.Promise[Boolean], unlock: () => js.Promise[Unit]): ILockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), try_lock = js.Any.fromFunction0(try_lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[ILockable]
  }
}

