package typings
package tstlLib.baseContainerILinearContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinearContainer[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */]
  extends tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, T]
     with tstlLib.baseDisposableIPartialContainersMod._IPushBack[T] {
  /**
    * Fill Assigner.
    *
    * @param n Initial size.
    * @param val Value to fill.
    */
  def assign(n: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * Get the last element.
    *
    * @return The last element.
    */
  def back(): T = js.native
  /**
    * Change the last element.
    *
    * @param val The value to change.
    */
  def back(`val`: T): scala.Unit = js.native
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
    * Insert a single element.
    *
    * @param pos Position to insert.
    * @param val Value to insert.
    * @return An iterator to the newly inserted element.
    */
  def insert(pos: IteratorT, `val`: T): IteratorT = js.native
  /**
    * Insert range elements.
    *
    * @param pos Position to insert.
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
    * @return An iterator to the first of the newly inserted elements.
    */
  def insert[InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](pos: IteratorT, first: InputIterator, last: InputIterator): IteratorT = js.native
  /**
    * Erase the last element.
    */
  def pop_back(): scala.Unit = js.native
  /**
    * Resize this {@link Vector} forcibly.
    *
    * @param n New container size.
    */
  def resize(n: scala.Double): scala.Unit = js.native
}

