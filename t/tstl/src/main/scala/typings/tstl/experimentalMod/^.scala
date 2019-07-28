package typings.tstl.experimentalMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Pick
import typings.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm
import typings.tstl.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType
import typings.tstl.experimentalAlgorithmMod.IErasableContainer
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlStrings.remove_if
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental", JSImport.Namespace)
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
  def erase[Container /* <: Pick[_IListAlgorithm[ValueType[Container], Container], remove_if] */](contaier: Container, `val`: ValueType[Container]): Unit = js.native
  @JSName("erase")
  def erase_Container_IErasableContainerIteratorIterator_IForwardIteratorValueTypeIteratorIterator[Container /* <: IErasableContainer[Iterator] */, Iterator /* <: IForwardIterator[typings.tstl.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, `val`: typings.tstl.functionalIPointerMod.IPointerNs.ValueType[Iterator]): Unit = js.native
  def erase_if[Container /* <: Pick[_IListAlgorithm[ValueType[Container], Container], remove_if] */](contaier: Container, predicator: js.Function1[/* val */ ValueType[Container], Boolean]): Unit = js.native
  @JSName("erase_if")
  def erase_if_Container_IErasableContainerIteratorIterator_IForwardIteratorValueTypeIteratorIterator[Container /* <: IErasableContainer[Iterator] */, Iterator /* <: IForwardIterator[typings.tstl.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](
    container: Container,
    predicator: js.Function1[
      /* val */ typings.tstl.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
      Boolean
    ]
  ): Unit = js.native
}

