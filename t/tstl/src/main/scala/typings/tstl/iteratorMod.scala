package typings.tstl

import typings.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typings.tstl.backInsertIteratorMod.BackInsertIterator.ValueType
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ReverseIteratorType
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iemptyMod.IEmpty
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.iinsertMod.IInsert
import typings.tstl.ipushbackMod.IPushBack
import typings.tstl.ipushfrontMod.IPushFront
import typings.tstl.ireversableiteratorMod.IReversableIterator
import typings.tstl.ireverseiteratorMod.IReverseIterator
import typings.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  @js.native
  class BackInsertIterator[Source /* <: IPushBack[ValueType[Source]] */] protected ()
    extends typings.tstl.backInsertIteratorMod.BackInsertIterator[Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class FrontInsertIterator[Source /* <: IPushFront[typings.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType[Source]] */] protected ()
    extends typings.tstl.frontInsertIteratorMod.FrontInsertIterator[Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class InsertIterator[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */] protected ()
    extends typings.tstl.insertIteratorMod.InsertIterator[Container, Iterator] {
    /**
      * Initializer Constructor.
      *
      * @param container Target container to insert.
      * @param it Iterator to the position to insert.
      */
    def this(container: Container, it: Iterator) = this()
  }
  
  def advance[InputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  @JSName("back_inserter")
  def backInserter[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): typings.tstl.backInsertIteratorMod.BackInsertIterator[SourceType[Source]] = js.native
  def begin[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  def distance[InputIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def empty(source: js.Array[_]): Boolean = js.native
  def empty(source: IEmpty): Boolean = js.native
  def end[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  @JSName("front_inserter")
  def frontInserter[Source /* <: IPushFront[typings.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType[Source]] */](source: Source): typings.tstl.frontInsertIteratorMod.FrontInsertIterator[Source] = js.native
  def inserter[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typings.tstl.insertIteratorMod.InsertIterator[Container, Iterator] = js.native
  @JSName("make_reverse_iterator")
  def makeReverseIterator[IteratorT /* <: IReversableIterator[typings.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[typings.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def next[ForwardIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[typings.tstl.ipointerMod.IPointer.ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[
    typings.tstl.ipointerMod.IPointer.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[
    typings.tstl.ipointerMod.IPointer.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def rbegin[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def rend[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def size(source: js.Array[_]): Double = js.native
  def size(source: ISize): Double = js.native
}

