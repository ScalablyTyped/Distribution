package typings
package tstlLib.experimentalThreadTimedSemaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread/TimedSemaphore", "TimedSemaphore")
@js.native
class TimedSemaphore protected ()
  extends tstlLib.baseThreadUnderscoreISemaphoreMod._ISemaphore {
  /**
    * Construct from section size.
    *
    * @param size Number of maximum sections lockable.
    */
  def this(size: scala.Double) = this()
  /**
    * @hidden
    */
  var _Compute_excess_count: js.Any = js.native
  /**
    * @hidden
    */
  var _Compute_resolve_count: js.Any = js.native
  /**
    * @hidden
    */
  var _Unlock: js.Any = js.native
  /**
    * @hidden
    */
  var hold_count_ : js.Any = js.native
  /**
    * @hidden
    */
  var locked_count_ : js.Any = js.native
  /**
    * @hidden
    */
  var resolvers_ : js.Any = js.native
  /**
    * @hidden
    */
  var size_ : js.Any = js.native
  /**
    * Try lock sections until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @param count Count to lock.
    * @return Whether succeded to lock or not.
    */
  def try_lock_for(ms: scala.Double): js.Promise[scala.Boolean] = js.native
  def try_lock_for(ms: scala.Double, count: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Try lock sections until time expiration.
    *
    * @param at The maximum time point to wait.
    * @param count Count to lock.
    * @return Whether succeded to lock or not.
    */
  def try_lock_until(at: stdLib.Date): js.Promise[scala.Boolean] = js.native
  def try_lock_until(at: stdLib.Date, count: scala.Double): js.Promise[scala.Boolean] = js.native
}

