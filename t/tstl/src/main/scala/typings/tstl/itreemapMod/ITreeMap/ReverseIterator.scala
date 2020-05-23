package typings.tstl.itreemapMod.ITreeMap

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link ITreeMap}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.ReverseIterator<Key, T, Unique, Source, IteratorT, ReverseT> */
trait ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: typings.tstl.itreemapMod.ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key
  /**
    * The second, stored element.
    */
  var second: T
  val value: Entry[Key, T]
  def base(): IteratorT
  def next(): ReverseT
  def prev(): ReverseT
  def source(): Source
}

object ReverseIterator {
  @scala.inline
  def apply[Key, T, Unique, Source, IteratorT, ReverseT](
    base: () => IteratorT,
    first: Key,
    next: () => ReverseT,
    prev: () => ReverseT,
    second: T,
    source: () => Source,
    value: Entry[Key, T]
  ): ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), first = first.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), second = second.asInstanceOf[js.Any], source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT]]
  }
}

