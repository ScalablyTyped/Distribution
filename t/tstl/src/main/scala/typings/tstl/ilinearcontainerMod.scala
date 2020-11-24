package typings.tstl

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ifrontMod.IFront
import typings.tstl.ilinearcontainerMod.ILinearContainer.Iterator
import typings.tstl.ilinearcontainerMod.ILinearContainer.ReverseIterator
import typings.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/base/container/ILinearContainer", JSImport.Namespace)
@js.native
object ilinearcontainerMod extends js.Object {
  
  @js.native
  trait ILinearContainer[T /* <: PElem */, SourceT /* <: ILinearContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, PElem]
    extends ILinearContainerBase[T, SourceT, IteratorT, ReverseT, PElem]
       with IFront[T] {
    
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[PElem, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
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
  @js.native
  object ILinearContainer extends js.Object {
    
    /**
      * Iterator of {@link ILinearContainer}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[T /* <: ElemT */, SourceT /* <: ILinearContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/ILinearContainer.ILinearContainer.Iterator<T, SourceT, IteratorT, ReverseT, T> */ js.Object */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] = typings.tstl.icontainerMod.IContainer.Iterator[T, SourceT, IteratorT, ReverseT, ElemT]
    
    /**
      * Reverse iterator of {@link ILinearContainer}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[T /* <: ElemT */, SourceT /* <: ILinearContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/ILinearContainer.ILinearContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, T> */ js.Object */, ElemT] = typings.tstl.icontainerMod.IContainer.ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]
  }
}
