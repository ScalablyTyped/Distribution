package typings.tstl.multiSetMod.MultiSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link MultiSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, false, SourceT, IteratorT, ReverseT> */
trait ReverseIterator[Key, SourceT /* <: typings.tstl.multiSetMod.MultiSet[Key, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[Key, SourceT, IteratorT, ReverseT](
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

