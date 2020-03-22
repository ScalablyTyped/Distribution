package typings.tstl

import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.forwardListMod.ForwardList.Iterator
import typings.tstl.iclearMod.IClear
import typings.tstl.idequeMod.IDeque
import typings.tstl.iemptyMod.IEmpty
import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ifrontMod.IFront
import typings.tstl.ilistalgorithmMod.IListAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/ForwardList", JSImport.Namespace)
@js.native
object forwardListMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class ForwardList[T] ()
    extends IForwardContainer[Iterator[T]]
       with IClear
       with IEmpty
       with IDeque[T]
       with IFront[T]
       with Iterable[T]
       with IListAlgorithm[T, ForwardList[T]] {
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
    def this(obj: ForwardList[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
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
    def this(n: Double, `val`: T) = this()
    var _Insert_by_range: js.Any = js.native
    var _Insert_by_repeating_val: js.Any = js.native
    var before_begin_ : js.Any = js.native
    var end_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_ForwardList: js.Function0[IterableIterator[T]] = js.native
    var ptr_ : js.Any = js.native
    var size_ : js.Any = js.native
    /**
      * Fill Assigner.
      *
      * @param n Initial size.
      * @param val Value to fill.
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    def assign[T, InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to before beginning.
      *
      * @return Iterator to the before beginning.
      */
    def before_begin(): Iterator[T] = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* CompleteClass */
    override def begin(): Iterator[T] = js.native
    /**
      * Clear elements.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
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
    override def end(): Iterator[T] = js.native
    /**
      * Erase elements.
      *
      * @param first Range of the first position to erase after.
      * @param last Rangee of the last position to erase.
      * @return Iterator to the last removed element.
      */
    def erase_after(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param it Position to erase after.
      * @return Iterator to the erased element.
      */
    def erase_after(it: Iterator[T]): Iterator[T] = js.native
    /**
      * Inserted repeated elements.
      *
      * @param pos Position to insert after.
      * @param n Number of elements to insert.
      * @param val Value to insert repeatedly.
      * @return An iterator to the last of the newly inserted elements.
      */
    def insert_after(pos: Iterator[T], n: Double, `val`: T): Iterator[T] = js.native
    /**
      * Insert an element.
      *
      * @param pos Position to insert after.
      * @param val Value to insert.
      * @return An iterator to the newly inserted element.
      */
    def insert_after(pos: Iterator[T], `val`: T): Iterator[T] = js.native
    /**
      * Insert range elements.
      *
      * @param pos Position to insert after.
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      * @return An iterator to the last of the newly inserted elements.
      */
    def insert_after[T, InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: Iterator[T], first: InputIterator, last: InputIterator): Iterator[T] = js.native
    /**
      * Erase the first element.
      */
    /* CompleteClass */
    override def pop_front(): Unit = js.native
    /**
      * Insert an element at the first.
      *
      * @param val Value to insert.
      */
    /* CompleteClass */
    override def push_front(`val`: T): Unit = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    override def size(): Double = js.native
    /**
      * Transfer elements.
      *
      * @param pos Position to insert after.
      * @param from Target container to transfer.
      */
    def splice_after(pos: Iterator[T], from: ForwardList[T]): Unit = js.native
    /**
      * Transfer a single element.
      *
      * @param pos Position to insert after.
      * @param from Target container to transfer.
      * @param before Previous position of the single element to transfer.
      */
    def splice_after(pos: Iterator[T], from: ForwardList[T], before: Iterator[T]): Unit = js.native
    /**
      * Transfer range elements.
      *
      * @param pos Position to insert after.
      * @param from Target container to transfer.
      * @param first Range of previous of the first position to transfer.
      * @param last Rangee of the last position to transfer.
      */
    def splice_after(pos: Iterator[T], from: ForwardList[T], first_before: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    def toJSON(): js.Array[T] = js.native
  }
  
  @js.native
  object ForwardList extends js.Object {
    /**
      * Iterator of {@link ForwardList}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class Iterator[T] protected () extends IForwardIterator[T, Iterator[T]] {
      var _Try_value: js.Any = js.native
      var next_ : js.Any = js.native
      var source_ptr_ : js.Any = js.native
      var value_ : js.Any = js.native
      /**
        * Get source container.
        *
        * @return The source container.
        */
      def source(): ForwardList[T] = js.native
      /**
        * @inheritDoc
        */
      @JSName("value")
      def value_MIterator(): T = js.native
      /**
        * @inheritDoc
        */
      @JSName("value")
      def value_MIterator(`val`: T): js.Any = js.native
    }
    
  }
  
}

