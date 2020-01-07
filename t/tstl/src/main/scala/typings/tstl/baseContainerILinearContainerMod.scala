package typings.tstl

import typings.std.Iterator
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/ILinearContainer", JSImport.Namespace)
@js.native
object baseContainerILinearContainerMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushBack<T> * / any */ @js.native
  trait ILinearContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseIteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IReverseIterator<T, SourceT, IteratorT, ReverseIteratorT, T> */ js.Any */, ElemT] extends IContainer[T, SourceT, IteratorT, ReverseIteratorT, ElemT] {
    /**
      * Fill Assigner.
      *
      * @param n Initial size.
      * @param val Value to fill.
      */
    def assign(n: Double, `val`: T): Unit = js.native
    /**
      * Get the last element.
      *
      * @return The last element.
      */
    def back(): T = js.native
    /**
      * Change the last element.
      *
      * @param val The value to change.
      */
    def back(`val`: T): Unit = js.native
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
      * Insert a single element.
      *
      * @param pos Position to insert.
      * @param val Value to insert.
      * @return An iterator to the newly inserted element.
      */
    def insert(pos: IteratorT, `val`: T): IteratorT = js.native
    /**
      * Insert range elements.
      *
      * @param pos Position to insert.
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      * @return An iterator to the first of the newly inserted elements.
      */
    def insert[InputIterator /* <: IForwardIterator[T, InputIterator] */](pos: IteratorT, first: InputIterator, last: InputIterator): IteratorT = js.native
    /**
      * Erase the last element.
      */
    def pop_back(): Unit = js.native
    /**
      * @inheritDoc
      */
    def push_back(`val`: T): Unit = js.native
    /**
      * Resize this {@link Vector} forcibly.
      *
      * @param n New container size.
      */
    def resize(n: Double): Unit = js.native
  }
  
  @js.native
  trait _IFront[T] extends js.Object {
    /**
      * Get the first element.
      *
      * @return The first element.
      */
    def front(): T = js.native
    /**
      * Change the first element.
      *
      * @param val The value to change.
      */
    def front(`val`: T): Unit = js.native
  }
  
}

