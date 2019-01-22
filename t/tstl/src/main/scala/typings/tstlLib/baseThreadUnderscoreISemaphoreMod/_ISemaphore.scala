package typings
package tstlLib.baseThreadUnderscoreISemaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ISemaphore extends js.Object {
  /**
    * Lock sections until be unlocked.
    *
    * @param count Count to lock. Default is `1`.
    */
  def lock(): js.Promise[scala.Unit] = js.native
  def lock(count: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Number of maximum sections lockable.
    */
  def size(): scala.Double = js.native
  /**
    * Try {@link lock} sections.
    *
    * @param count Count to try lock. Default is `1`.
    * @return Whether succeeded to lock or not.
    */
  def try_lock(): js.Promise[scala.Boolean] = js.native
  def try_lock(count: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Unlock sections.
    *
    * @param count Count to unlock. Default is `1`.
    */
  def unlock(): js.Promise[scala.Unit] = js.native
  def unlock(count: scala.Double): js.Promise[scala.Unit] = js.native
}

