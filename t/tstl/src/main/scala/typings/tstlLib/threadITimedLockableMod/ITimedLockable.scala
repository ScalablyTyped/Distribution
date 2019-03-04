package typings
package tstlLib.threadITimedLockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimedLockable
  extends tstlLib.threadILockableMod.ILockable {
  /**
    * Try lock until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_for(ms: scala.Double): js.Promise[scala.Boolean]
  /**
    * Try lock until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_until(at: stdLib.Date): js.Promise[scala.Boolean]
}

object ITimedLockable {
  @scala.inline
  def apply(
    lock: js.Function0[js.Promise[scala.Unit]],
    try_lock: js.Function0[js.Promise[scala.Boolean]],
    try_lock_for: js.Function1[scala.Double, js.Promise[scala.Boolean]],
    try_lock_until: js.Function1[stdLib.Date, js.Promise[scala.Boolean]],
    unlock: js.Function0[js.Promise[scala.Unit]]
  ): ITimedLockable = {
    val __obj = js.Dynamic.literal(lock = lock, try_lock = try_lock, try_lock_for = try_lock_for, try_lock_until = try_lock_until, unlock = unlock)
  
    __obj.asInstanceOf[ITimedLockable]
  }
}

