package typings
package tstlLib.iteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def advance[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](it: InputIterator, n: scala.Double): InputIterator = js.native
  def back_inserter[T](source: js.Array[T]): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, tstlLib.containerVectorMod.Vector[T]] = js.native
  def back_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] */](source: Source): tstlLib.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def begin[T, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[T, Iterator]): Iterator = js.native
  def distance[T, InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): scala.Double = js.native
  def empty(source: tstlLib.baseDisposableIPartialContainersMod._IEmpty): scala.Boolean = js.native
  def empty[T](source: js.Array[T]): scala.Boolean = js.native
  def end[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.Iterator[T] = js.native
  def end[T, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */](container: tstlLib.baseDisposableIForwardContainerMod.IForwardContainer[T, Iterator]): Iterator = js.native
  def front_inserter[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IPushFront[T] */](source: Source): tstlLib.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def inserter[T](container: js.Array[T], it: tstlLib.containerVectorMod.VectorNs.Iterator[T]): tstlLib.iteratorInsertIteratorMod.InsertIterator[
    T, 
    tstlLib.containerVectorMod.Vector[T], 
    tstlLib.containerVectorMod.VectorNs.Iterator[T]
  ] = js.native
  def inserter[T, Container /* <: tstlLib.baseDisposableIPartialContainersMod._IInsert[T, Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator] */](container: Container, it: Iterator): tstlLib.iteratorInsertIteratorMod.InsertIterator[T, Container, Iterator] = js.native
  def make_reverse_iterator[T, IteratorT /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def next[T, ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[T, ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator] */](it: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def prev[T, BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[T, BidirectionalIterator /* <: tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator] */](it: BidirectionalIterator, n: scala.Double): BidirectionalIterator = js.native
  def rbegin[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rbegin[T, Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, Iterator, ReverseIterator] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, Iterator, ReverseIterator] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[T, Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def rend[T](container: js.Array[T]): tstlLib.containerVectorMod.VectorNs.ReverseIterator[T] = js.native
  def rend[T, Iterator /* <: tstlLib.iteratorIReverseIteratorMod.IReversableIterator[T, Iterator, ReverseIterator] */, ReverseIterator /* <: tstlLib.iteratorIReverseIteratorMod.IReverseIterator[T, Iterator, ReverseIterator] */](
    container: tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[T, Iterator, ReverseIterator]
  ): ReverseIterator = js.native
  def size(source: tstlLib.baseDisposableIPartialContainersMod._ISize): scala.Double = js.native
  def size[T](source: js.Array[T]): scala.Double = js.native
}

