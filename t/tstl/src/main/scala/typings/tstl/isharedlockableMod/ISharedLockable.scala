package typings.tstl.isharedlockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedLockable extends js.Object {
  /**
    * Lock shared until be unlock shared.
    */
  def lock_shared(): js.Promise[Unit]
  /**
    * Try lock shared.
    */
  def try_lock_shared(): js.Promise[Boolean]
  /**
    * Unlock shared.
    */
  def unlock_shared(): js.Promise[Unit]
}

object ISharedLockable {
  @scala.inline
  def apply(
    lock_shared: () => js.Promise[Unit],
    try_lock_shared: () => js.Promise[Boolean],
    unlock_shared: () => js.Promise[Unit]
  ): ISharedLockable = {
    val __obj = js.Dynamic.literal(lock_shared = js.Any.fromFunction0(lock_shared), try_lock_shared = js.Any.fromFunction0(try_lock_shared), unlock_shared = js.Any.fromFunction0(unlock_shared))
  
    __obj.asInstanceOf[ISharedLockable]
  }
}

