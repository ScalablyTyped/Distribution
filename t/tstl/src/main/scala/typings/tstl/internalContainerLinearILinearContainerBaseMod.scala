package typings.tstl

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.internalContainerPartialIPushBackMod.IPushBack
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/ILinearContainerBase", JSImport.Namespace)
@js.native
object internalContainerLinearILinearContainerBaseMod extends js.Object {
  @js.native
  trait ILinearContainerBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT, T> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, T> */ js.Any */, ElemT]
    extends IContainer[T, SourceT, IteratorT, ReverseT, ElemT]
       with IPushBack[T] {
    /**
      * Fill Assigner.
      *
      * @param n Initial size.
      * @param val Value to fill.
      */
    def assign(n: Double, `val`: T): Unit = js.native
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
      * Resize this {@link Vector} forcibly.
      *
      * @param n New container size.
      */
    def resize(n: Double): Unit = js.native
  }
  
}

