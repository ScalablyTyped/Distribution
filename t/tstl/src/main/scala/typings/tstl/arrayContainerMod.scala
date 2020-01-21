package typings.tstl

import typings.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.containerContainerMod.Container
import typings.tstl.icontainerMod.IContainer
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipushbackMod.IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/ArrayContainer", JSImport.Namespace)
@js.native
object arrayContainerMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.ilinearcontainerbaseMod.ILinearContainerBase because var conflicts: iterator. Inlined resize, push_back, pop_back, insert, insert, insert */ @js.native
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
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[ElemT, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
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

