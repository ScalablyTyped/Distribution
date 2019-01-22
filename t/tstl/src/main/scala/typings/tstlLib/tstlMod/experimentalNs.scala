package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "experimental")
@js.native
object experimentalNs extends js.Object {
  @js.native
  class Barrier protected ()
    extends tstlLib.experimentalMod.Barrier {
    def this(size: scala.Double) = this()
  }
  
  @js.native
  class FlexBarrier protected ()
    extends tstlLib.experimentalMod.FlexBarrier {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
      */
    def this(size: scala.Double) = this()
    def this(size: scala.Double, complete: js.Function0[scala.Double]) = this()
  }
  
  @js.native
  class Latch protected ()
    extends tstlLib.experimentalMod.Latch {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      */
    def this(size: scala.Double) = this()
  }
  
  @js.native
  class Semaphore protected ()
    extends tstlLib.experimentalMod.Semaphore {
    def this(size: scala.Double) = this()
  }
  
  @js.native
  class TimedSemaphore protected ()
    extends tstlLib.experimentalMod.TimedSemaphore {
    /**
      * Construct from section size.
      *
      * @param size Number of maximum sections lockable.
      */
    def this(size: scala.Double) = this()
  }
  
  val barrier: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadBarrierMod.Barrier] = js.native
  val flex_barrier: org.scalablytyped.runtime.Instantiable2[
    /* size */ scala.Double, 
    /* complete */ js.UndefOr[/* complete */ js.Function0[scala.Double]], 
    tstlLib.experimentalThreadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadLatchMod.Latch] = js.native
  val semaphore: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadSemaphoreMod.Semaphore] = js.native
  val timed_semaphore: org.scalablytyped.runtime.Instantiable1[
    /* size */ scala.Double, 
    tstlLib.experimentalThreadTimedSemaphoreMod.TimedSemaphore
  ] = js.native
  def erase[T, Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[T, Container], 
    tstlLib.tstlLibStrings.remove_if
  ] */](contaier: Container, `val`: T): scala.Unit = js.native
  @JSName("erase")
  def erase_TContainerIContainerIteratorReadonly[T, Container /* <: tstlLib.experimentalAlgorithmMod.IContainer[T, Iterator] */, Iterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator]] */](container: Container, `val`: T): scala.Unit = js.native
  def erase_if[T, Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[T, Container], 
    tstlLib.tstlLibStrings.remove_if
  ] */](contaier: Container, predicator: js.Function1[/* val */ T, scala.Boolean]): scala.Unit = js.native
  @JSName("erase_if")
  def erase_if_TContainerIContainerIteratorReadonly[T, Container /* <: tstlLib.experimentalAlgorithmMod.IContainer[T, Iterator] */, Iterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator]] */](container: Container, predicator: js.Function1[/* val */ T, scala.Boolean]): scala.Unit = js.native
}

