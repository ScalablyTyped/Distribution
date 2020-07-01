package typings.tstl.setContainerMod.SetContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link SetContainer}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined std.Readonly<tstl.tstl/base/container/IContainer.IContainer.Iterator<Key, SourceT, IteratorT, ReverseT, Key>> */
trait Iterator[Key, Unique /* <: Boolean */, SourceT /* <: typings.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[Key, /* <: scala.Boolean */ Unique, /* <: typings.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */ SourceT, /* <: typings.tstl.setContainerMod.SetContainer.Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */ IteratorT, /* <: typings.tstl.setContainerMod.SetContainer.ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */ ReverseT](
    next: () => IteratorT,
    prev: () => IteratorT,
    reverse: () => ReverseT,
    source: () => SourceT,
    value: Key
  ): Iterator[Key, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), reverse = js.Any.fromFunction0(reverse), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterator[Key, Unique, SourceT, IteratorT, ReverseT]]
  }
}

