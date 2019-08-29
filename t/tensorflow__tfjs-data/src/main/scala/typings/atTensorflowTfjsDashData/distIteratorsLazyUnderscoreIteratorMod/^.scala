package typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashData.distTypesMod.IteratorContainer
import typings.std.Error
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def iteratorFromConcatenated[T](baseIterators: LazyIterator[LazyIterator[T]]): LazyIterator[T] = js.native
  def iteratorFromConcatenated[T](
    baseIterators: LazyIterator[LazyIterator[T]],
    baseErrorHandler: js.Function1[/* e */ Error, Boolean]
  ): LazyIterator[T] = js.native
  def iteratorFromConcatenatedFunction[T](iteratorFunc: js.Function0[IteratorResult[LazyIterator[T], _]], count: Double): LazyIterator[T] = js.native
  def iteratorFromConcatenatedFunction[T](
    iteratorFunc: js.Function0[IteratorResult[LazyIterator[T], _]],
    count: Double,
    baseErrorHandler: js.Function1[/* e */ Error, Boolean]
  ): LazyIterator[T] = js.native
  def iteratorFromFunction[T](func: js.Function0[(IteratorResult[T, _]) | (js.Promise[IteratorResult[T, _]])]): LazyIterator[T] = js.native
  def iteratorFromIncrementing(start: Double): LazyIterator[Double] = js.native
  def iteratorFromItems[T](items: js.Array[T]): LazyIterator[T] = js.native
  def iteratorFromZipped[O /* <: TensorContainer */](iterators: IteratorContainer): LazyIterator[O] = js.native
  def iteratorFromZipped[O /* <: TensorContainer */](iterators: IteratorContainer, mismatchMode: ZipMismatchMode): LazyIterator[O] = js.native
}

