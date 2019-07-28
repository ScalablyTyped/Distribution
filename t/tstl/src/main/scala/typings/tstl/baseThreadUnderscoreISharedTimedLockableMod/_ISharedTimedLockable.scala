package typings.tstl.baseThreadUnderscoreISharedTimedLockableMod

import typings.std.Date
import typings.tstl.baseThreadUnderscoreISharedLockableMod._ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ISharedTimedLockable extends _ISharedLockable {
  /**
    * Try lock shared until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_for(ms: Double): js.Promise[Boolean]
  /**
    * Try lock shared until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_until(at: Date): js.Promise[Boolean]
}

object _ISharedTimedLockable {
  @scala.inline
  def apply(
    lock_shared: () => js.Promise[Unit],
    try_lock_shared: () => js.Promise[Boolean],
    try_lock_shared_for: Double => js.Promise[Boolean],
    try_lock_shared_until: Date => js.Promise[Boolean],
    unlock_shared: () => js.Promise[Unit]
  ): _ISharedTimedLockable = {
    val __obj = js.Dynamic.literal(lock_shared = js.Any.fromFunction0(lock_shared), try_lock_shared = js.Any.fromFunction0(try_lock_shared), try_lock_shared_for = js.Any.fromFunction1(try_lock_shared_for), try_lock_shared_until = js.Any.fromFunction1(try_lock_shared_until), unlock_shared = js.Any.fromFunction0(unlock_shared))
  
    __obj.asInstanceOf[_ISharedTimedLockable]
  }
}

