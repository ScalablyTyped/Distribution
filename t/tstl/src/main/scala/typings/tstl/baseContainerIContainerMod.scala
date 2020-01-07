package typings.tstl

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Iterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IContainer", JSImport.Namespace)
@js.native
object baseContainerIContainerMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBidirectionalContainer<Iterator<T, SourceT, IteratorT, ReverseIteratorT, Elem>, ReverseIteratorT> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IEmpty * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ISize * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPush<Elem> * / any */ @js.native
  trait IContainer[T /* <: Elem */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseIteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IReverseIterator<T, SourceT, IteratorT, ReverseIteratorT, Elem> */ js.Any */, Elem] extends Iterable[T] {
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
    def begin(): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def clear(): Unit = js.native
    /**
      * @inheritDoc
      */
    def empty(): Boolean = js.native
    /**
      * @inheritDoc
      */
    def end(): IteratorT = js.native
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
    def push(items: Elem*): Double = js.native
    /**
      * @inheritDoc
      */
    def rbegin(): ReverseIteratorT = js.native
    /**
      * @inheritDoc
      */
    def rend(): ReverseIteratorT = js.native
    /**
      * @inheritDoc
      */
    def size(): Double = js.native
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

