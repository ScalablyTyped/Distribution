package typings.tstl

import typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer
import typings.tstl.baseDisposableIPartialContainersMod._IEmpty
import typings.tstl.baseDisposableIPartialContainersMod._IInsert
import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import typings.tstl.baseDisposableIPartialContainersMod._IPushFront
import typings.tstl.baseDisposableIPartialContainersMod._ISize
import typings.tstl.containerVectorMod.Vector
import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.containerVectorMod.Vector.ReverseIterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.iteratorIReverseIteratorMod.IReversableIterator
import typings.tstl.iteratorIReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  @js.native
  class BackInsertIterator[T, Source /* <: _IPushBack[T] */] protected ()
    extends typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class FrontInsertIterator[T, Source /* <: _IPushFront[T] */] protected ()
    extends typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class InsertIterator[Container /* <: _IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected ()
    extends typings.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] {
    /**
      * Initializer Constructor.
      *
      * @param container Target container to insert.
      * @param it Iterator to the position to insert.
      */
    def this(container: Container, it: Iterator) = this()
  }
  
  def advance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  def back_inserter[T](source: js.Array[T]): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Vector[T]] = js.native
  def back_inserter[T, Source /* <: _IPushBack[T] */](source: Source): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
  def begin[T](container: js.Array[T]): Iterator[T] = js.native
  def begin[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
  def distance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def empty(source: _IEmpty): Boolean = js.native
  def empty[T](source: js.Array[T]): Boolean = js.native
  def end[T](container: js.Array[T]): Iterator[T] = js.native
  def end[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: IForwardContainer[Iterator]): Iterator = js.native
  def front_inserter[T, Source /* <: _IPushFront[T] */](source: Source): typings.tstl.iteratorFrontInsertIteratorMod.FrontInsertIterator[T, Source] = js.native
  def inserter[T](container: js.Array[T], it: Iterator[T]): typings.tstl.iteratorInsertIteratorMod.InsertIterator[Vector[T], Iterator[T]] = js.native
  def inserter[Container /* <: _IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typings.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
  def make_reverse_iterator[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def rbegin[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rbegin[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
  def rend[T](container: js.Array[T]): ReverseIterator[T] = js.native
  def rend[Iterator /* <: IReversableIterator[ValueType[Iterator], Iterator, ReverseIterator] */, ReverseIterator /* <: IReverseIterator[ValueType[Iterator], Iterator, ReverseIterator] */](container: IBidirectionalContainer[Iterator, ReverseIterator]): ReverseIterator = js.native
  def size(source: _ISize): Double = js.native
  def size[T](source: js.Array[T]): Double = js.native
}

