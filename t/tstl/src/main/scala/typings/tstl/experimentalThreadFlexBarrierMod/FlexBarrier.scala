package typings.tstl.experimentalThreadFlexBarrierMod

import typings.std.Date
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
  def this(size: Double) = this()
  def this(size: Double, complete: js.Function0[Double]) = this()
  /**
    * @hidden
    */
  var complete_ : js.Any = js.native
  /**
    * @hidden
    */
  var count_ : js.Any = js.native
  /**
    * @hidden
    */
  var cv_ : js.Any = js.native
  /**
    * @hidden
    */
  var size_ : Double = js.native
  def arrive(): js.Promise[Unit] = js.native
  def arrive(n: Double): js.Promise[Unit] = js.native
  def arrive_and_reset(): js.Promise[Unit] = js.native
  def arrive_and_wait(): js.Promise[Unit] = js.native
  def wait_for(ms: Double): js.Promise[Boolean] = js.native
  def wait_until(at: Date): js.Promise[Boolean] = js.native
}

