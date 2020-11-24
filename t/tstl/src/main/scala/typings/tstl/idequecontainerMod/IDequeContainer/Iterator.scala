package typings.tstl.idequecontainerMod.IDequeContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Iterator of {@link IDequeContainer}.
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.Iterator<T, SourceT, IteratorT, ReverseT, ElemT> */
@js.native
trait Iterator[T /* <: ElemT */, SourceT /* <: typings.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
  
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
  
  val value: T = js.native
}
