package typings.tstl.mapContainerMod.MapContainer

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.IteratorBase<Key, T> & std.Readonly<tstl.tstl/base/container/IContainer.IContainer.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, SourceT, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>> */
@js.native
trait Iterator[Key, T, Unique /* <: Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */] extends js.Object {
  
  /**
    * The first, key element.
    */
  val first: Key = js.native
  
  def next(): IteratorT = js.native
  
  def prev(): IteratorT = js.native
  
  def reverse(): ReverseT = js.native
  
  /**
    * The second, stored element.
    */
  var second: T = js.native
  
  def source(): SourceT = js.native
  
  val value: Entry[Key, T] = js.native
}
object Iterator {
  
  @scala.inline
  def apply[Key, T, Unique /* <: Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */](
    first: Key,
    next: () => IteratorT,
    prev: () => IteratorT,
    reverse: () => ReverseT,
    second: T,
    source: () => SourceT,
    value: Entry[Key, T]
  ): Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), reverse = js.Any.fromFunction0(reverse), second = second.asInstanceOf[js.Any], source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT]]
  }
  
  @scala.inline
  implicit class IteratorOps[Self <: Iterator[_, _, _, _, _, _], Key, T, Unique /* <: Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */] (val x: Self with (Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: Key): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => IteratorT): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => IteratorT): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: () => ReverseT): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecond(value: T): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: () => SourceT): Self = this.set("source", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Entry[Key, T]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
