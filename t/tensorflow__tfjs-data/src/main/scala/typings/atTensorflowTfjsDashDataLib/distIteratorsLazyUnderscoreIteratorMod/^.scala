package typings
package atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def iteratorFromConcatenated[T](baseIterators: LazyIterator[LazyIterator[T]]): LazyIterator[T] = js.native
  def iteratorFromConcatenated[T](
    baseIterators: LazyIterator[LazyIterator[T]],
    baseErrorHandler: js.Function1[/* e */ stdLib.Error, scala.Boolean]
  ): LazyIterator[T] = js.native
  def iteratorFromConcatenatedFunction[T](iteratorFunc: js.Function0[stdLib.IteratorResult[LazyIterator[T]]], count: scala.Double): LazyIterator[T] = js.native
  def iteratorFromConcatenatedFunction[T](
    iteratorFunc: js.Function0[stdLib.IteratorResult[LazyIterator[T]]],
    count: scala.Double,
    baseErrorHandler: js.Function1[/* e */ stdLib.Error, scala.Boolean]
  ): LazyIterator[T] = js.native
  def iteratorFromFunction[T](func: js.Function0[stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]]]): LazyIterator[T] = js.native
  def iteratorFromIncrementing(start: scala.Double): LazyIterator[scala.Double] = js.native
  def iteratorFromItems[T](items: js.Array[T]): LazyIterator[T] = js.native
  def iteratorFromZipped[O /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](iterators: atTensorflowTfjsDashDataLib.distTypesMod.IteratorContainer): LazyIterator[O] = js.native
  def iteratorFromZipped[O /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](
    iterators: atTensorflowTfjsDashDataLib.distTypesMod.IteratorContainer,
    mismatchMode: ZipMismatchMode
  ): LazyIterator[O] = js.native
}

