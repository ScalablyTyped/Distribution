package typings.tstl.experimentalThreadMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val barrier: Instantiable1[/* size */ Double, typings.tstl.experimentalThreadBarrierMod.Barrier] = js.native
  val couting_semaphore: Instantiable1[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Max */ /* max */ js.Any, 
    typings.tstl.experimentalThreadSemaphoreMod.Semaphore[Double]
  ] = js.native
  val flex_barrier: Instantiable2[
    /* size */ Double, 
    js.UndefOr[/* complete */ js.Function0[Double]], 
    typings.tstl.experimentalThreadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: Instantiable1[/* size */ Double, typings.tstl.experimentalThreadLatchMod.Latch] = js.native
}

