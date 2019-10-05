package typings.tstl

import typings.tstl.baseContainerIDequeContainerMod._IDeque
import typings.tstl.baseContainerListContainerMod.ListContainer
import typings.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm
import typings.tstl.baseDisposableIPartialContainersMod._IPushBack
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.containerListMod.List
import typings.tstl.containerListMod.List.Iterator
import typings.tstl.containerListMod.List.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/List", JSImport.Namespace)
@js.native
object containerListMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerILinearContainerMod.ILinearContainer because var conflicts: iterator. Inlined back, back
  - typings.tstl.baseContainerIDequeContainerMod.IDequeContainer because var conflicts: iterator. Inlined  */ @js.native
  /**
    * Default Constructor.
    */
  class List[T] ()
    extends ListContainer[T, List[T], Iterator[T], ReverseIterator[T]]
       with _IListAlgorithm[T, List[T]]
       with _IDeque[T]
       with _IPushBack[T] {
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
    /**
      * @hidden
      */
    var _Quick_sort: js.Any = js.native
    /**
      * @hidden
      */
    var _Quick_sort_partition: js.Any = js.native
    /**
      * @hidden
      */
    var ptr_ : js.Any = js.native
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
    def front(): T = js.native
    /**
      * @inheritDoc
      */
    def front(`val`: T): Unit = js.native
    /**
      * Erase the first element.
      */
    /* InferMemberOverrides */
    override def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def push_back(`val`: T): Unit = js.native
    /**
      * Insert an element at the first.
      *
      * @param val Value to insert.
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
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class list[T] () extends List[T] {
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
  }
  
  @js.native
  object List extends js.Object {
    /**
      * Iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    /**
      * @hidden
      */
    class Iterator[T] protected () extends ListIterator[T, List[T], Iterator[T], ReverseIterator[T], T] {
      /**
        * @hidden
        */
      var source_ptr_ : js.Any = js.native
    }
    
    /**
      * Reverse iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    class ReverseIterator[T] ()
      extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, List[T], Iterator[T], ReverseIterator[T], T]
    
  }
  
  @js.native
  object list extends js.Object {
    /**
      * Iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    /**
      * @hidden
      */
    class Iterator[T] protected ()
      extends typings.tstl.containerListMod.List.Iterator[T]
    
    /**
      * Reverse iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    @js.native
    class ReverseIterator[T] ()
      extends typings.tstl.containerListMod.List.ReverseIterator[T]
    
  }
  
}

