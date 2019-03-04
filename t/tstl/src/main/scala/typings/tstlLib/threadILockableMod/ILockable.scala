package typings
package tstlLib.threadILockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockable extends js.Object {
  /**
    * Lock until be unlocked.
    */
  def lock(): js.Promise[scala.Unit]
  /**
    * Try {@link lock}.
    *
    * @return Whether succeeded to lock or not.
    */
  def try_lock(): js.Promise[scala.Boolean]
  /**
    * Unlock.
    */
  def unlock(): js.Promise[scala.Unit]
}

object ILockable {
  @scala.inline
  def apply(
    lock: js.Function0[js.Promise[scala.Unit]],
    try_lock: js.Function0[js.Promise[scala.Boolean]],
    unlock: js.Function0[js.Promise[scala.Unit]]
  ): ILockable = {
    val __obj = js.Dynamic.literal(lock = lock, try_lock = try_lock, unlock = unlock)
  
    __obj.asInstanceOf[ILockable]
  }
}

