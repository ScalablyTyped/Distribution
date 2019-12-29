package typings.tstl

import org.scalablytyped.runtime.Instantiable1
import typings.tstl.threadFlexBarrierMod.FlexBarrier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/Barrier", JSImport.Namespace)
@js.native
object threadBarrierMod extends js.Object {
  @js.native
  class Barrier protected () extends FlexBarrier {
    def this(size: Double) = this()
  }
  
  val barrier: Instantiable1[/* size */ Double, Barrier] = js.native
  type barrier = Barrier
}

