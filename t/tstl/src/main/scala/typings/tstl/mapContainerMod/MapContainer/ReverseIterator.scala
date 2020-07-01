package typings.tstl.mapContainerMod.MapContainer

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.IteratorBase<Key, T> & std.Readonly<tstl.tstl/base/container/IContainer.IContainer.ReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, SourceT, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>> */
trait ReverseIterator[Key, T, Unique /* <: Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
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
  def source(): SourceT
}

object ReverseIterator {
  @scala.inline
  def apply[Key, T, /* <: scala.Boolean */ Unique, /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */ SourceT, /* <: typings.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */ IteratorT, /* <: typings.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */ ReverseT](
    base: () => IteratorT,
    first: Key,
    next: () => ReverseT,
    prev: () => ReverseT,
    second: T,
    source: () => SourceT,
    value: Entry[Key, T]
  ): ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), first = first.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), second = second.asInstanceOf[js.Any], source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT]]
  }
}

