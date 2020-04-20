package typings.tstl.icontainerMod.IContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IContainer}
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined parent std.Readonly<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, IteratorT, ReverseT>> */
trait ReverseIterator[T /* <: Elem */, Source /* <: typings.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem] extends js.Object {
  val value: T
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): Source
}

object ReverseIterator {
  @scala.inline
  def apply[T /* <: Elem */, Source /* <: typings.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem](base: () => IteratorT, next: () => ReverseT, prev: () => ReverseT, source: () => Source, value: T): ReverseIterator[T, Source, IteratorT, ReverseT, Elem] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[T, Source, IteratorT, ReverseT, Elem]]
  }
}

