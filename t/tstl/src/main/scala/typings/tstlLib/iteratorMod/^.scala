package typings
package tstlLib.iteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def advance[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](it: InputIterator, n: scala.Double): InputIterator = js.native
  def back_inserter[T](source: js.Array[T]): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, tstlLib.containerVectorMod.Vector[T]] = js.native
  def back_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] */](source: Source): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def begin[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[Iterator]): Iterator = js.native
  def distance[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): scala.Double = js.native
  def empty(source: tstlLib.baseDisposableIPartialContainersMod._IEmpty): scala.Boolean = js.native
  def empty[T](source: js.Array[T]): scala.Boolean = js.native
  def end[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def end[Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[Iterator]): Iterator = js.native
  def front_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] */](source: Source): tstlLib.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def inserter[T](container: js.Array[T], it: tstlLib.containerVectorMod.VectorNs.Iterator[T]): tstlLib.iteratorInsertIteratorMod.InsertIterator[
    tstlLib.containerVectorMod.Vector[T], 
    tstlLib.containerVectorMod.VectorNs.Iterator[T]
  ] = js.native
  def inserter[Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): tstlLib.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
  def make_reverse_iterator[IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def next[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator, n: scala.Double): BidirectionalIterator = js.native
  def rbegin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def rend[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rend[Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
    Iterator, 
    ReverseIterator
  ] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def size(source: tstlLib.baseDisposableIPartialContainersMod._ISize): scala.Double = js.native
  def size[T](source: js.Array[T]): scala.Double = js.native
}

