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
  def erase[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    `val`: tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container]
  ): scala.Unit = js.native
  @JSName("erase")
  def erase_ContainerIContainerIteratorReadonly[Container /* <: tstlLib.experimentalAlgorithmMod.IContainer[Iterator] */, Iterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator]
  ] */](container: Container, `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator]): scala.Unit = js.native
  def erase_if[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    predicator: js.Function1[
      /* val */ tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  @JSName("erase_if")
  def erase_if_ContainerIContainerIteratorReadonly[Container /* <: tstlLib.experimentalAlgorithmMod.IContainer[Iterator] */, Iterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator]
  ] */](
    container: Container,
    predicator: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
}

