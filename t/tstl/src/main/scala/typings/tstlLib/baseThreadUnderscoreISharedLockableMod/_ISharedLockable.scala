package typings
package tstlLib.baseThreadUnderscoreISharedLockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ISharedLockable extends js.Object {
  /**
    * Lock shared until be unlock shared.
    */
  def lock_shared(): js.Promise[scala.Unit]
  /**
    * Try lock shared.
    */
  def try_lock_shared(): js.Promise[scala.Boolean]
  /**
    * Unlock shared.
    */
  def unlock_shared(): js.Promise[scala.Unit]
}

object _ISharedLockable {
  @scala.inline
  def apply(
    lock_shared: () => js.Promise[scala.Unit],
    try_lock_shared: () => js.Promise[scala.Boolean],
    unlock_shared: () => js.Promise[scala.Unit]
  ): _ISharedLockable = {
    val __obj = js.Dynamic.literal(lock_shared = js.Any.fromFunction0(lock_shared), try_lock_shared = js.Any.fromFunction0(try_lock_shared), unlock_shared = js.Any.fromFunction0(unlock_shared))
  
    __obj.asInstanceOf[_ISharedLockable]
  }
}

