package typings.tstl.uniqueSetMod.UniqueSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link UniqueSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, true, SourceT, IteratorT, ReverseT> */
trait ReverseIterator[Key, SourceT /* <: typings.tstl.uniqueSetMod.UniqueSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[Key, /* <: typings.tstl.uniqueSetMod.UniqueSet[Key, SourceT, IteratorT, ReverseT] */ SourceT, /* <: typings.tstl.uniqueSetMod.UniqueSet.Iterator[Key, SourceT, IteratorT, ReverseT] */ IteratorT, /* <: typings.tstl.uniqueSetMod.UniqueSet.ReverseIterator[Key, SourceT, IteratorT, ReverseT] */ ReverseT](
    base: () => IteratorT,
    next: () => ReverseT,
    prev: () => ReverseT,
    source: () => SourceT,
    value: Key
  ): ReverseIterator[Key, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, SourceT, IteratorT, ReverseT]]
  }
}

