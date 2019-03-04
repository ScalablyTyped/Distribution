package typings
package tstlLib.baseThreadUnderscoreISharedTimedLockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ISharedTimedLockable
  extends tstlLib.baseThreadUnderscoreISharedLockableMod._ISharedLockable {
  /**
    * Try lock shared until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_for(ms: scala.Double): js.Promise[scala.Boolean]
  /**
    * Try lock shared until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_until(at: stdLib.Date): js.Promise[scala.Boolean]
}

object _ISharedTimedLockable {
  @scala.inline
  def apply(
    lock_shared: js.Function0[js.Promise[scala.Unit]],
    try_lock_shared: js.Function0[js.Promise[scala.Boolean]],
    try_lock_shared_for: js.Function1[scala.Double, js.Promise[scala.Boolean]],
    try_lock_shared_until: js.Function1[stdLib.Date, js.Promise[scala.Boolean]],
    unlock_shared: js.Function0[js.Promise[scala.Unit]]
  ): _ISharedTimedLockable = {
    val __obj = js.Dynamic.literal(lock_shared = lock_shared, try_lock_shared = try_lock_shared, try_lock_shared_for = try_lock_shared_for, try_lock_shared_until = try_lock_shared_until, unlock_shared = unlock_shared)
  
    __obj.asInstanceOf[_ISharedTimedLockable]
  }
}

