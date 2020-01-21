package typings.tstl

import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import typings.tstl.idequeMod.IDeque
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ilinearcontainerMod.ILinearContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IDequeContainer", JSImport.Namespace)
@js.native
object idequecontainerMod extends js.Object {
  @js.native
  trait IDequeContainer[T /* <: PElem */, SourceT /* <: IDequeContainer[T, SourceT, IteratorT, ReverseT, PElem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, PElem] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, PElem] */, PElem]
    extends ILinearContainer[T, SourceT, IteratorT, ReverseT, PElem]
       with IDeque[T] {
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[PElem, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
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
  object IDequeContainer extends js.Object {
    /**
      * Iterator of {@link IDequeContainer}.
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    type Iterator[T /* <: ElemT */, SourceT /* <: IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/IDequeContainer.IDequeContainer.Iterator<T, SourceT, IteratorT, ReverseT, T> */ js.Object */, ReverseT /* <: typings.tstl.idequecontainerMod.IDequeContainer.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] = typings.tstl.ilinearcontainerMod.ILinearContainer.Iterator[T, SourceT, IteratorT, ReverseT, ElemT]
    /**
      * Reverse iterator of {@link IDequeContainer}.
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    type ReverseIterator[T /* <: ElemT */, SourceT /* <: IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: typings.tstl.idequecontainerMod.IDequeContainer.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/IDequeContainer.IDequeContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, T> */ js.Object */, ElemT] = typings.tstl.ilinearcontainerMod.ILinearContainer.ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]
  }
  
}

