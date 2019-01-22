package typings
package tstlLib.experimentalThreadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread", "FlexBarrier")
@js.native
class FlexBarrier protected ()
  extends tstlLib.experimentalThreadFlexBarrierMod.FlexBarrier {
  /**
    * Initializer Constructor.
    *
    * @param size Size of the downward counter.
    * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
    */
  def this(size: scala.Double) = this()
  def this(size: scala.Double, complete: js.Function0[scala.Double]) = this()
}

