package typings.tstl

import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer
import typings.tstl.baseDisposableIPartialContainersMod._IEmpty
import typings.tstl.baseDisposableIPartialContainersMod._IPush
import typings.tstl.baseDisposableIPartialContainersMod._ISize
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IContainer", JSImport.Namespace)
@js.native
object baseContainerIContainerMod extends js.Object {
  @js.native
  trait IContainer[T /* <: Elem */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem]
    extends IBidirectionalContainer[Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem], ReverseIteratorT]
       with Iterable[T]
       with _IEmpty
       with _ISize
       with _IPush[Elem] {
    /**
      * @inheritDoc
      */
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_IContainer: js.Function0[IterableIterator[T]] = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    def assign[InputIterator /* <: IForwardIterator[Elem, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
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
  
}

