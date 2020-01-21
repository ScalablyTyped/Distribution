package typings.tstl

import typings.tstl.iarraycontainerMod.IArrayContainer.Iterator
import typings.tstl.iarraycontainerMod.IArrayContainer.ReverseIterator
import typings.tstl.ilinearcontainerMod.ILinearContainer
import typings.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IArrayContainer", JSImport.Namespace)
@js.native
object iarraycontainerMod extends js.Object {
  @js.native
  trait IArrayContainer[T /* <: PElem */, SourceT /* <: IArrayContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, PElem] extends ILinearContainer[T, SourceT, IteratorT, ReverseT, PElem] {
    /**
      * Get element at specific position.
      *
      * @param index Specific position.
      * @return The element at the *index*.
      */
    def at(index: Double): T = js.native
    /**
      * Get iterator at specific position.
      *
      * @param index Specific position.
      * @return The iterator at the *index*.
      */
    def nth(index: Double): IteratorT = js.native
    /**
      * Change element at specific position.
      *
      * @param index Specific position.
      * @param val The new value to change.
      */
    def set(index: Double, `val`: T): Unit = js.native
  }
  
  @js.native
  object IArrayContainer extends js.Object {
    /**
      * Iterator of {@link IArrayContainer}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[T /* <: ElemT */, SourceT /* <: IArrayContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/IArrayContainer.IArrayContainer.Iterator<T, SourceT, IteratorT, ReverseT, T> */ js.Object */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] = (typings.tstl.ilinearcontainerMod.ILinearContainer.Iterator[T, SourceT, IteratorT, ReverseT, ElemT]) with (IRandomAccessIterator[T, IteratorT])
    /**
      * Reverse iterator of {@link IArrayContainer}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    type ReverseIterator[T /* <: ElemT */, SourceT /* <: IArrayContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/IArrayContainer.IArrayContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, T> */ js.Object */, ElemT] = (typings.tstl.ilinearcontainerMod.ILinearContainer.ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]) with (IRandomAccessIterator[T, ReverseT])
  }
  
}

