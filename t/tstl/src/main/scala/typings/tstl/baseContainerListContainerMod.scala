package typings.tstl

import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/ListContainer", JSImport.Namespace)
@js.native
object baseContainerListContainerMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ListContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected () extends Container[T, SourceT, IteratorT, ReverseIteratorT, T] {
    /**
      * @hidden
      */
    var _Insert_by_repeating_val: js.Any = js.native
    /**
      * @hidden
      */
    var begin_ : IteratorT = js.native
    /**
      * @hidden
      */
    var end_ : IteratorT = js.native
    /**
      * @hidden
      */
    var size_ : js.Any = js.native
    /**
      * @hidden
      */
    /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT): IteratorT = js.native
    /* protected */ def _Create_iterator(prev: IteratorT, next: IteratorT, `val`: T): IteratorT = js.native
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[T, InputIterator] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def insert(position: IteratorT, size: Double, `val`: T): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def insert(position: IteratorT, `val`: T): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def insert[InputIterator /* <: IForwardIterator[T, InputIterator] */](position: IteratorT, begin: InputIterator, end: InputIterator): IteratorT = js.native
    /**
      * @inheritDoc
      */
    def pop_back(): Unit = js.native
    /**
      * @inheritDoc
      */
    def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    def push_back(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def push_front(`val`: T): Unit = js.native
    /**
      * @inheritDoc
      */
    def resize(n: Double): Unit = js.native
  }
  
}

