package typings
package tstlLib.baseContainerContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/Container", "Container")
@js.native
abstract class Container[T /* <: Elem */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] ()
  extends tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[T]] = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  override def begin(): tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  override def empty(): scala.Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  override def end(): tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* CompleteClass */
  override def push(items: Elem*): scala.Double = js.native
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
  override def size(): scala.Double = js.native
}

