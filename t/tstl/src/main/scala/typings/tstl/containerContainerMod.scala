package typings.tstl

import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/Container", JSImport.Namespace)
@js.native
object containerContainerMod extends js.Object {
  @js.native
  abstract class Container[T /* <: PElem */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, PElem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, PElem] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, PElem] */, PElem] () extends IContainer[T, SourceT, IteratorT, ReverseT, PElem] {
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* CompleteClass */
    override def begin(): Iterator[T, SourceT, IteratorT, ReverseT, PElem] = js.native
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
    override def end(): Iterator[T, SourceT, IteratorT, ReverseT, PElem] = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* CompleteClass */
    override def push(items: PElem*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* CompleteClass */
    override def rbegin(): ReverseT = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    override def rend(): ReverseT = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    override def size(): Double = js.native
  }
  
}

