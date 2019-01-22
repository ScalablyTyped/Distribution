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

