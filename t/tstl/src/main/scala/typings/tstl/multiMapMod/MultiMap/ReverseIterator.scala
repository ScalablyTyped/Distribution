package typings.tstl.multiMapMod.MultiMap

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reverse iterator of {@link MultiMap}
  *
  * @author Jenogho Nam <http://samchon.org>
  */
/* Inlined tstl.tstl/base/container/MapContainer.MapContainer.ReverseIterator<Key, T, false, SourceT, IteratorT, ReverseT> */
@js.native
trait ReverseIterator[Key, T, SourceT /* <: typings.tstl.multiMapMod.MultiMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] */] extends js.Object {
  
  def base(): IteratorT = js.native
  
  /**
    * The first, key element.
    */
  val first: Key = js.native
  
  def next(): ReverseT = js.native
  
  def prev(): ReverseT = js.native
  
  /**
    * The second, stored element.
    */
  var second: T = js.native
  
  def source(): SourceT = js.native
  
  val value: Entry[Key, T] = js.native
}
object ReverseIterator {
  
  @scala.inline
  def apply[Key, T, SourceT /* <: typings.tstl.multiMapMod.MultiMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] */](
    base: () => IteratorT,
    first: Key,
    next: () => ReverseT,
    prev: () => ReverseT,
    second: T,
    source: () => SourceT,
    value: Entry[Key, T]
  ): ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), first = first.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), second = second.asInstanceOf[js.Any], source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[Key, T, SourceT, IteratorT, ReverseT]]
  }
  
  @scala.inline
  implicit class ReverseIteratorOps[Self <: ReverseIterator[_, _, _, _, _], Key, T, SourceT /* <: typings.tstl.multiMapMod.MultiMap[Key, T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, SourceT, IteratorT, ReverseT] */] (val x: Self with (ReverseIterator[Key, T, SourceT, IteratorT, ReverseT])) extends AnyVal {
    
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
    def setBase(value: () => IteratorT): Self = this.set("base", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: Key): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => ReverseT): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => ReverseT): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecond(value: T): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: () => SourceT): Self = this.set("source", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Entry[Key, T]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
