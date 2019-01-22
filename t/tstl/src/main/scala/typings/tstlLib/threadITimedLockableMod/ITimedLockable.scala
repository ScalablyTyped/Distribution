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

