package typings.tstl

import typings.tstl.iarraycontainerMod.IArrayContainer.Iterator
import typings.tstl.iarraycontainerMod.IArrayContainer.ReverseIterator
import typings.tstl.ilinearcontainerMod.ILinearContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    /* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.Iterator<T, SourceT, IteratorT, ReverseT, ElemT> & tstl.tstl/iterator/IRandomAccessIterator.IRandomAccessIterator<T, IteratorT> */
    @js.native
    trait Iterator[T /* <: ElemT */, SourceT /* <: IArrayContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
      
      /**
        * Advance iterator.
        *
        * @param n Step to advance.
        * @return The advanced iterator.
        */
      def advance(n: Double): IteratorT = js.native
      
      @JSName("equals")
      var equals_Original: js.Function1[/* obj */ IteratorT, Boolean] = js.native
      
      /**
        * Get index.
        *
        * @return The index.
        */
      def index(): Double = js.native
      
      def next(): IteratorT = js.native
      
      def prev(): IteratorT = js.native
      
      /**
        * @inheritDoc
        */
      def reverse(): ReverseT = js.native
      
      /**
        * Get source container.
        *
        * @return The source container.
        */
      def source(): SourceT = js.native
      
      /**
        * Reference of the value.
        */
      val value: T = js.native
    }
    
    /**
      * Reverse iterator of {@link IArrayContainer}
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, ElemT> & tstl.tstl/iterator/IRandomAccessIterator.IRandomAccessIterator<T, ReverseT> */
    @js.native
    trait ReverseIterator[T /* <: ElemT */, SourceT /* <: IArrayContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
      
      /**
        * Advance iterator.
        *
        * @param n Step to advance.
        * @return The advanced iterator.
        */
      def advance(n: Double): ReverseT = js.native
      
      def base(): IteratorT = js.native
      
      @JSName("equals")
      var equals_Original: js.Function1[/* obj */ ReverseT, Boolean] = js.native
      
      /**
        * Get index.
        *
        * @return The index.
        */
      def index(): Double = js.native
      
      def next(): ReverseT = js.native
      
      def prev(): ReverseT = js.native
      
      /**
        * Get source container.
        *
        * @return The source container.
        */
      def source(): SourceT = js.native
      
      /**
        * Reference of the value.
        */
      val value: T = js.native
    }
  }
}
