package typings.tstl.icontainerMod

import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import typings.tstl.iemptyMod.IEmpty
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipushMod.IPush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer_[T /* <: PElem */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, PElem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, PElem] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, PElem] */, PElem]
  extends IBidirectionalContainer[Iterator[T, SourceT, IteratorT, ReverseT, PElem], ReverseT]
     with Iterable[T]
     with IEmpty
     with IPush[PElem] {
  /**
    * @inheritDoc
    */
  @JSName(js.Symbol.iterator)
  var iterator_IContainer_ : js.Function0[IterableIterator[T]] = js.native
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def assign[InputIterator /* <: IForwardIterator[PElem, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * @inheritDoc
    */
  def clear(): Unit = js.native
  /**
    * Erase elements in range.
    *
    * @param first Range of the first position to erase.
    * @param last Rangee of the last position to erase.
    * @return Iterator following the last removed element, strained by the erasing.
    */
  def erase(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * Erase an element.
    *
    * @param pos Position to erase.
    * @return Iterator following the *pos*, strained by the erasing.
    */
  def erase(pos: IteratorT): IteratorT = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  def swap(obj: SourceT): Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  def toJSON(): js.Array[T] = js.native
}

