package typings.tstl

import typings.tstl.idequeMod.IDeque
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ifrontMod.IFront
import typings.tstl.ilistalgorithmMod.IListAlgorithm
import typings.tstl.listContainerMod.ListContainer
import typings.tstl.listIteratorMod.ListIterator
import typings.tstl.listMod.List.Iterator
import typings.tstl.listMod.List.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/List", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.ipushbackMod.IPushBack because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.ilinearcontainerbaseMod.ILinearContainerBase because Already inherited
  - typings.tstl.ilinearcontainerMod.ILinearContainer because var conflicts: iterator. Inlined back, back */ @js.native
  /**
    * Default Constructor.
    */
  class List[T] ()
    extends ListContainer[T, List[T], Iterator[T], ReverseIterator[T]]
       with IDeque[T]
       with IListAlgorithm[T, List[T]]
       with IFront[T] {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(items: js.Array[T]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: List[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      */
    def this(
      first: IForwardIterator[T, IForwardIterator[T, _]],
      last: IForwardIterator[T, IForwardIterator[T, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(size: Double, `val`: T) = this()
    var _Quick_sort: js.Any = js.native
    var _Quick_sort_partition: js.Any = js.native
    var ptr_ : js.Any = js.native
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
    /**
      * Get the last element.
      *
      * @return The last element.
      */
    def back(): T = js.native
    /**
      * @inheritDoc
      */
    /**
      * Change the last element.
      *
      * @param val The value to change.
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
    override def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[T]): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def push_front(`val`: T): Unit = js.native
    /**
      * Transfer elements.
      *
      * @param pos Position to insert.
      * @param from Target container to transfer.
      */
    def splice(pos: Iterator[T], from: List[T]): Unit = js.native
    /**
      * Transfer range elements.
      *
      * @param pos Position to insert.
      * @param from Target container to transfer.
      * @param first Range of the first position to transfer.
      * @param last Rangee of the last position to transfer.
      */
    def splice(pos: Iterator[T], from: List[T], first: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * Transfer a single element.
      *
      * @param pos Position to insert.
      * @param from Target container to transfer.
      * @param it Position of the single element to transfer.
      */
    def splice(pos: Iterator[T], from: List[T], it: Iterator[T]): Unit = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: List[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  
  @js.native
  object List extends js.Object {
    /**
      * Iterator of {@link List}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class Iterator[T] protected () extends ListIterator[T, List[T], Iterator[T], ReverseIterator[T], T] {
      var source_ptr_ : js.Any = js.native
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
    /**
      * Reverse iterator of {@link List}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class ReverseIterator[T] ()
      extends typings.tstl.reverseIteratorMod.ReverseIterator[T, List[T], Iterator[T], ReverseIterator[T], T] {
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
  }
  
}

