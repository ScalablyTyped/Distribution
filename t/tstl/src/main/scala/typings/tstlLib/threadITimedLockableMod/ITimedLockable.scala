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
    lock: () => js.Promise[scala.Unit],
    try_lock: () => js.Promise[scala.Boolean],
    try_lock_for: scala.Double => js.Promise[scala.Boolean],
    try_lock_until: stdLib.Date => js.Promise[scala.Boolean],
    unlock: () => js.Promise[scala.Unit]
  ): ITimedLockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), try_lock = js.Any.fromFunction0(try_lock), try_lock_for = js.Any.fromFunction1(try_lock_for), try_lock_until = js.Any.fromFunction1(try_lock_until), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[ITimedLockable]
  }
}

