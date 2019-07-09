package typings
package tstlLib.baseContainerArrayContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerILinearContainerMod.ILinearContainer because var conflicts: iterator. Inlined resize, back, back, push_back, pop_back, insert, insert, insert */ @JSImport("tstl/base/container/ArrayContainer", "ArrayContainer")
@js.native
abstract class ArrayContainer[T /* <: ElemT */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: tstlLib.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: tstlLib.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] ()
  extends tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, ElemT] {
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](pos: IteratorT, first: InputIterator, last: InputIterator): IteratorT = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_repeating_val(position: IteratorT, n: scala.Double, `val`: T): IteratorT = js.native
  /**
    * Get element at specific position.
    *
    * @param index Specific position.
    * @return The element at the *index*.
    */
  def at(index: scala.Double): T = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get the last element.
    *
    * @return The last element.
    */
  def back(): T = js.native
  /**
    * @inheritDoc
    */
  /**
    * Change the last element.
    *
    * @param val The value to change.
    */
  def back(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def front(): T = js.native
  /**
    * @inheritDoc
    */
  def front(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Insert repeated elements.
    *
    * @param pos Position to insert.
    * @param n Number of elements to insert.
    * @param val Value to insert repeatedly.
    * @return An iterator to the first of the newly inserted elements.
    */
  def insert(pos: IteratorT, n: scala.Double, `val`: T): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Insert a single element.
    *
    * @param pos Position to insert.
    * @param val Value to insert.
    * @return An iterator to the newly inserted element.
    */
  def insert(pos: IteratorT, `val`: T): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Insert range elements.
    *
    * @param pos Position to insert.
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
    * @return An iterator to the first of the newly inserted elements.
    */
  def insert[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator] */](pos: IteratorT, first: InputIterator, last: InputIterator): IteratorT = js.native
  def nth(index: scala.Double): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Erase the last element.
    */
  def pop_back(): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def push_back(`val`: T): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  /**
    * Resize this {@link Vector} forcibly.
    *
    * @param n New container size.
    */
  def resize(n: scala.Double): scala.Unit = js.native
  /**
    * Change element at specific position.
    *
    * @param index Specific position.
    * @param val The new value to change.
    */
  def set(index: scala.Double, `val`: T): scala.Unit = js.native
}

