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

