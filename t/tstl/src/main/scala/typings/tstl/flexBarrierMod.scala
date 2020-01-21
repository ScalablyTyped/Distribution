package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/FlexBarrier", JSImport.Namespace)
@js.native
object flexBarrierMod extends js.Object {
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
    var complete_ : js.Any = js.native
    var count_ : js.Any = js.native
    var cv_ : js.Any = js.native
    var size_ : Double = js.native
    def arrive(): js.Promise[Unit] = js.native
    def arrive(n: Double): js.Promise[Unit] = js.native
    def arrive_and_drop(): js.Promise[Unit] = js.native
    def arrive_and_wait(): js.Promise[Unit] = js.native
  }
  
}

