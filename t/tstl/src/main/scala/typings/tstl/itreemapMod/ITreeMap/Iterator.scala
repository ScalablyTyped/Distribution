package typings.tstl.itreemapMod.ITreeMap

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Iterator of {@link ITreeMap}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.Iterator<Key, T, Unique, Source, IteratorT, ReverseT> */
trait Iterator[Key, T, Unique /* <: Boolean */, Source /* <: typings.tstl.itreemapMod.ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] extends js.Object {
  /**
    * The first, key element.
    */
  val first: Key
  /**
    * The second, stored element.
    */
  var second: T
  val value: Entry[Key, T]
  def next(): IteratorT
  def prev(): IteratorT
  def reverse(): ReverseT
  def source(): Source
}

object Iterator {
  @scala.inline
  def apply[Key, T, Unique /* <: Boolean */, Source /* <: typings.tstl.itreemapMod.ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */](
    first: Key,
    next: () => IteratorT,
    prev: () => IteratorT,
    reverse: () => ReverseT,
    second: T,
    source: () => Source,
    value: Entry[Key, T]
  ): Iterator[Key, T, Unique, Source, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), reverse = js.Any.fromFunction0(reverse), second = second.asInstanceOf[js.Any], source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterator[Key, T, Unique, Source, IteratorT, ReverseT]]
  }
}

