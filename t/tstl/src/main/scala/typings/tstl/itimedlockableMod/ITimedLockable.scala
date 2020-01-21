package typings.tstl.itimedlockableMod

import typings.std.Date
import typings.tstl.ilockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimedLockable extends ILockable {
  /**
    * Try lock until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_for(ms: Double): js.Promise[Boolean]
  /**
    * Try lock until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_until(at: Date): js.Promise[Boolean]
}

object ITimedLockable {
  @scala.inline
  def apply(
    lock: () => js.Promise[Unit],
    try_lock: () => js.Promise[Boolean],
    try_lock_for: Double => js.Promise[Boolean],
    try_lock_until: Date => js.Promise[Boolean],
    unlock: () => js.Promise[Unit]
  ): ITimedLockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), try_lock = js.Any.fromFunction0(try_lock), try_lock_for = js.Any.fromFunction1(try_lock_for), try_lock_until = js.Any.fromFunction1(try_lock_until), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[ITimedLockable]
  }
}

