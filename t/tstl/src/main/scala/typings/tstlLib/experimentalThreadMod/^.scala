package typings
package tstlLib.experimentalThreadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/thread", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val barrier: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadBarrierMod.Barrier] = js.native
  val couting_semaphore: org.scalablytyped.runtime.Instantiable1[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Max */ /* max */ js.Any, 
    tstlLib.experimentalThreadSemaphoreMod.Semaphore[scala.Double]
  ] = js.native
  val flex_barrier: org.scalablytyped.runtime.Instantiable2[
    /* size */ scala.Double, 
    js.UndefOr[/* complete */ js.Function0[scala.Double]], 
    tstlLib.experimentalThreadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadLatchMod.Latch] = js.native
}

