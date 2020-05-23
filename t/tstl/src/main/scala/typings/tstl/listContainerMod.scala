package typings.tstl

import typings.tstl.containerContainerMod.Container
import typings.tstl.icontainerMod.IContainer
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipushbackMod.IPushBack
import typings.tstl.listIteratorMod.ListIterator
import typings.tstl.reverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/ListContainer", JSImport.Namespace)
@js.native
object listContainerMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.ilinearcontainerbaseMod.ILinearContainerBase because var conflicts: iterator. Inlined resize, push_back, pop_back, insert, insert, insert */ @js.native
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
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: IteratorT, last: IteratorT): IteratorT = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: IteratorT): IteratorT = js.native
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
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: SourceT): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  
}

