package typings.tstl.baseContainerContainerMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/Container", "Container")
@js.native
abstract class Container[T /* <: Elem */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] () extends IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  override def begin(): Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  override def empty(): Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  override def end(): Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* CompleteClass */
  override def push(items: Elem*): Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* CompleteClass */
  override def rbegin(): ReverseIteratorT = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* CompleteClass */
  override def rend(): ReverseIteratorT = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  override def size(): Double = js.native
}

