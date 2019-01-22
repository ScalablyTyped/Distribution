package typings
package tstlLib.baseContainerIContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT] */]
  extends tstlLib.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer[T, IteratorT, ReverseIteratorT]
     with stdLib.Iterable[T]
     with tstlLib.baseDisposableIPartialContainersMod._IEmpty
     with tstlLib.baseDisposableIPartialContainersMod._ISize
     with tstlLib.baseDisposableIPartialContainersMod._IPush[T] {
  /**
    * @inheritDoc
    */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_IContainer: js.Function0[stdLib.IterableIterator[T]] = js.native
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def assign[U /* <: T */, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[U, InputIterator]] */](first: InputIterator, last: InputIterator): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def clear(): scala.Unit = js.native
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
    * Insert a single element.
    *
    * @param pos Position to insert.
    * @param val Value to insert.
    */
  def insert(pos: IteratorT, `val`: T): IteratorT = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  def swap(obj: SourceT): scala.Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  def toJSON(): js.Array[T] = js.native
}

