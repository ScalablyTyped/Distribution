package typings.tstl

import typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer
import typings.tstl.baseDisposableIPartialContainersMod._IInsert
import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import typings.tstl.baseDisposableIPartialContainersMod._IPushFront
import typings.tstl.containerVectorMod.Vector
import typings.tstl.containerVectorMod.VectorNs.Iterator
import typings.tstl.containerVectorMod.VectorNs.ReverseIterator
import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator
import typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import typings.tstl.iteratorInsertIteratorMod.InsertIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/factory", JSImport.Namespace)
@js.native
object iteratorFactoryMod extends js.Object {
  def back_inserter[T](source: js.Array[T]): BackInsertIterator[T, Vector[T]] = js.native
  def back_inserter[T, Source /* <: _IPushBack[T] */](source: Source): BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): Iterator[T] = js.native
  def begin[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
  def end[T](container: js.Array[T]): Iterator[T] = js.native
  def end[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
  def front_inserter[T, Source /* <: _IPushFront[T] */](source: Source): FrontInsertIterator[T, Source] = js.native
  def inserter[T](container: js.Array[T], it: Iterator[T]): InsertIterator[Vector[T], Iterator[T]] = js.native
  def inserter[Container /* <: _IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): InsertIterator[Container, Iterator] = js.native
  def make_reverse_iterator[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def rbegin[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
  def rend[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rend[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
}

