package typings.tstl.experimentalThreadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread", "FlexBarrier")
@js.native
class FlexBarrier protected ()
  extends typings.tstl.experimentalThreadFlexBarrierMod.FlexBarrier {
  /**
    * Initializer Constructor.
    *
    * @param size Size of the downward counter.
    * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
    */
  def this(size: Double) = this()
  def this(size: Double, complete: js.Function0[Double]) = this()
}

