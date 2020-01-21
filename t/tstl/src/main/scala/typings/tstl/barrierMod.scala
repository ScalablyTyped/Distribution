package typings.tstl

import typings.tstl.flexBarrierMod.FlexBarrier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Barrier", JSImport.Namespace)
@js.native
object barrierMod extends js.Object {
  @js.native
  class Barrier protected () extends FlexBarrier {
    def this(size: Double) = this()
  }
  
}

