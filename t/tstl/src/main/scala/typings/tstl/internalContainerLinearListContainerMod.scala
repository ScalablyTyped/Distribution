package typings.tstl

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.internalContainerPartialIPushBackMod.IPushBack
import typings.tstl.internalIteratorListIteratorMod.ListIterator
import typings.tstl.internalIteratorReverseIteratorMod.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/ListContainer", JSImport.Namespace)
@js.native
object internalContainerLinearListContainerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.internalContainerLinearILinearContainerBaseMod.ILinearContainerBase because var conflicts: iterator. Inlined resize, push_back, pop_back, insert, insert, insert */ @js.native
  /**
    * Default Constructor.
    */
  abstract class ListContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected ()
    extends Container[T, SourceT, IteratorT, ReverseIteratorT, T]
       with IPushBack[T] {
    var _Insert_by_repeating_val: js.Any = js.native
    var begin_ : IteratorT = js.native
    var end_ : IteratorT = js.native
    var size_ : js.Any = js.native
    /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT): IteratorT = js.native
    /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT, `val`: T): IteratorT = js.native
    /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[T, InputIterator] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
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
    def insert(position: IteratorT, size: Double, `val`: T): IteratorT = js.native
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
    def insert(position: IteratorT, `val`: T): IteratorT = js.native
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
    def insert[InputIterator /* <: IForwardIterator[T, InputIterator] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Erase the last element.
      */
    def pop_back(): Unit = js.native
    /**
      * @inheritDoc
      */
    def pop_front(): Unit = js.native
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
    def push_front(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    /**
      * Resize this {@link Vector} forcibly.
      *
      * @param n New container size.
      */
    def resize(n: Double): Unit = js.native
  }
  
}

