package typings.tstl.itreesetMod.ITreeSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link ITreeSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.ReverseIterator<Key, Unique, SourceT, IteratorT, ReverseT> */
trait ReverseIterator[Key, Unique /* <: Boolean */, SourceT /* <: typings.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[Key, Unique /* <: Boolean */, SourceT /* <: typings.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */](
    base: () => IteratorT,
    next: () => ReverseT,
    prev: () => ReverseT,
    source: () => SourceT,
    value: Key
  ): ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT]]
  }
}

