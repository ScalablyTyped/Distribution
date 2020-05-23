package typings.tstl.idequecontainerMod.IDequeContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IDequeContainer}.
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, ElemT> */
trait ReverseIterator[T /* <: ElemT */, SourceT /* <: typings.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
  val value: T
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[T, SourceT, IteratorT, ReverseT, ElemT](base: () => IteratorT, next: () => ReverseT, prev: () => ReverseT, source: () => SourceT, value: T): ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]]
  }
}

