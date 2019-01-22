package typings
package tstlLib.experimentalThreadFlexBarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread/FlexBarrier", "FlexBarrier")
@js.native
class FlexBarrier protected () extends js.Object {
  /**
    * Initializer Constructor.
    *
    * @param size Size of the downward counter.
    * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
    */
  def this(size: scala.Double) = this()
  def this(size: scala.Double, complete: js.Function0[scala.Double]) = this()
  /**
    * @hidden
    */
  var `complete_`: js.Any = js.native
  /**
    * @hidden
    */
  var `count_`: js.Any = js.native
  /**
    * @hidden
    */
  var `cv_`: js.Any = js.native
  /**
    * @hidden
    */
  var `size_`: scala.Double = js.native
  def arrive(): js.Promise[scala.Unit] = js.native
  def arrive(n: scala.Double): js.Promise[scala.Unit] = js.native
  def arrive_and_reset(): js.Promise[scala.Unit] = js.native
  def arrive_and_wait(): js.Promise[scala.Unit] = js.native
  def wait_for(ms: scala.Double): js.Promise[scala.Boolean] = js.native
  def wait_until(at: stdLib.Date): js.Promise[scala.Boolean] = js.native
}

