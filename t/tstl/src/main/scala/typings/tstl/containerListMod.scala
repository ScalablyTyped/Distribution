package typings.tstl

import typings.tstl.baseContainerIDequeContainerMod._IDeque
import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.containerListMod.List.Iterator
import typings.tstl.containerListMod.List.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/List", JSImport.Namespace)
@js.native
object containerListMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListContainer<T, List<T>, List.Iterator<T>, List.ReverseIterator<T>> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IListAlgorithm<T, List<T>> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class List[T] ()
    extends ILinearContainer[T, List[T], Iterator[T], ReverseIterator[T], T]
       with _IDeque[T] {
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
      * @hidden
      */
    /* protected */ def _Create_iterator(prev: Iterator[T], next: Iterator[T], `val`: T): Iterator[T] = js.native
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
    def merge(source: List[T]): Unit = js.native
    def merge(source: List[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
    /**
      * Erase the first element.
      */
    /* CompleteClass */
    override def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    override def push_front(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def remove(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def remove_if(pred: js.Function1[/* val */ T, Boolean]): Unit = js.native
    /**
      * @inheritDoc
      */
    def reverse(): Unit = js.native
    /**
      * @inheritDoc
      */
    def sort(): Unit = js.native
    def sort(comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
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
      * @inheritDoc
      */
    def unique(): Unit = js.native
    def unique(binary_pred: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
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
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListIterator<T, List<T>, Iterator<T>, ReverseIterator<T>, T> * / any */ @js.native
    /**
      * @hidden
      */
    class Iterator[T] protected () extends js.Object {
      /**
        * @hidden
        */
      var source_ptr_ : js.Any = js.native
      def equals(obj: Iterator[T]): Boolean = js.native
      /**
        * @inheritDoc
        */
      def reverse(): ReverseIterator[T] = js.native
      /**
        * @inheritDoc
        */
      def source(): List[T] = js.native
      /**
        * @inheritDoc
        */
      def value(): T = js.native
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
    /**
      * Reverse iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReverseIteratorBase<T, List<T>, Iterator<T>, ReverseIterator<T>, T> * / any */ @js.native
    class ReverseIterator[T] () extends js.Object {
      /**
        * @hidden
        */
      /* protected */ def _Create_neighbor(base: Iterator[T]): ReverseIterator[T] = js.native
      /**
        * @inheritDoc
        */
      def value(): T = js.native
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
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

