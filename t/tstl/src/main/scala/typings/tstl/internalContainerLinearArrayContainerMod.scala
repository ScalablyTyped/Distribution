package typings.tstl

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.internalContainerPartialIPushBackMod.IPushBack
import typings.tstl.internalIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.internalIteratorArrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/ArrayContainer", JSImport.Namespace)
@js.native
object internalContainerLinearArrayContainerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.internalContainerLinearILinearContainerBaseMod.ILinearContainerBase because var conflicts: iterator. Inlined resize, push_back, pop_back, insert, insert, insert */ @js.native
  abstract class ArrayContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] ()
    extends Container[T, SourceT, IteratorT, ReverseT, ElemT]
       with IPushBack[T] {
    /* protected */ def _At(index: Double): T = js.native
    /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: IteratorT, first: InputIterator, last: InputIterator): IteratorT = js.native
    /* protected */ def _Insert_by_repeating_val(position: IteratorT, n: Double, `val`: T): IteratorT = js.native
    /* protected */ def _Pop_back(): Unit = js.native
    /* protected */ def _Set(index: Double, `val`: T): Unit = js.native
    /**
      * Get element at specific position.
      *
      * @param index Specific position.
      * @return The element at the *index*.
      */
    def at(index: Double): T = js.native
    /**
      * @inheritDoc
      */
    def back(): T = js.native
    /**
      * @inheritDoc
      */
    def back(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def front(): T = js.native
    /**
      * @inheritDoc
      */
    def front(`val`: T): Unit = js.native
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
    def insert(pos: IteratorT, n: Double, `val`: T): IteratorT = js.native
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
    def insert[InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: IteratorT, first: InputIterator, last: InputIterator): IteratorT = js.native
    def nth(index: Double): IteratorT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Erase the last element.
      */
    def pop_back(): Unit = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* CompleteClass */
    override def push_back(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    /**
      * Resize this {@link Vector} forcibly.
      *
      * @param n New container size.
      */
    def resize(n: Double): Unit = js.native
    /**
      * Change element at specific position.
      *
      * @param index Specific position.
      * @param val The new value to change.
      */
    def set(index: Double, `val`: T): Unit = js.native
    /* protected */ def source(): SourceT = js.native
  }
  
}

