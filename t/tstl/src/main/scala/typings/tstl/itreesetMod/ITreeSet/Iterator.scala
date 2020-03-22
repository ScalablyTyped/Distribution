package typings.tstl.itreesetMod.ITreeSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link ITreeSet}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/SetContainer.SetContainer.Iterator<Key, Unique, SourceT, IteratorT, ReverseT> */
trait Iterator[Key, Unique /* <: Boolean */, SourceT /* <: typings.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  val value: Key
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[Key, Unique /* <: Boolean */, SourceT /* <: typings.tstl.itreesetMod.ITreeSet[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */](
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

