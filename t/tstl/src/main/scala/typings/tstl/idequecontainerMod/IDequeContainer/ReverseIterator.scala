package typings.tstl.idequecontainerMod.IDequeContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reverse iterator of {@link IDequeContainer}.
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* Inlined tstl.tstl/base/container/ILinearContainer.ILinearContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT, ElemT> */
@js.native
trait ReverseIterator[T /* <: ElemT */, SourceT /* <: typings.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] extends js.Object {
  
  def base(): IteratorT = js.native
  
  def next(): ReverseT = js.native
  
  def prev(): ReverseT = js.native
  
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT = js.native
  
  val value: T = js.native
}
object ReverseIterator {
  
  @scala.inline
  def apply[T /* <: ElemT */, SourceT /* <: typings.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT](base: () => IteratorT, next: () => ReverseT, prev: () => ReverseT, source: () => SourceT, value: T): ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] = {
    val __obj = js.Dynamic.literal(base = js.Any.fromFunction0(base), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), source = js.Any.fromFunction0(source), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT]]
  }
  
  @scala.inline
  implicit class ReverseIteratorOps[Self <: ReverseIterator[_, _, _, _, _], T /* <: ElemT */, SourceT /* <: typings.tstl.idequecontainerMod.IDequeContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */, ElemT] (val x: Self with (ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT])) extends AnyVal {
    
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
    def setNext(value: () => ReverseT): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => ReverseT): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSource(value: () => SourceT): Self = this.set("source", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
