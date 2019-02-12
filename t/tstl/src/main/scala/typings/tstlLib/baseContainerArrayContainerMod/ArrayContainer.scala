package typings
package tstlLib.baseContainerArrayContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerILinearContainerMod.ILinearContainer because var conflicts: iterator. Inlined assign, assign, resize, back, back, push_back, pop_back, insert, insert, insert */ @JSImport("tstl/base/container/ArrayContainer", "ArrayContainer")
@js.native
abstract class ArrayContainer[T, SourceT /* <: ArrayContainer[T, SourceT] */] ()
  extends tstlLib.baseContainerContainerMod.Container[
      T, 
      SourceT, 
      tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
      tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
      T
    ] {
  /**
    * @hidden
    */
  /* protected */ def _Erase_by_range(
    first: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT],
    last: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT]
  ): tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_range[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](
    pos: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT],
    first: InputIterator,
    last: InputIterator
  ): tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT] = js.native
  /**
    * @hidden
    */
  /* protected */ def _Insert_by_repeating_val(
    position: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT],
    n: scala.Double,
    `val`: T
  ): tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT] = js.native
  /**
    * Fill Assigner.
    *
    * @param n Initial size.
    * @param val Value to fill.
    */
  def assign(n: scala.Double, `val`: T): scala.Unit = js.native
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
  def insert(pos: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], n: scala.Double, `val`: T): tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT] = js.native
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
  def insert(pos: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], `val`: T): tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT] = js.native
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
  def insert[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](
    pos: tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT],
    first: InputIterator,
    last: InputIterator
  ): tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT] = js.native
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

