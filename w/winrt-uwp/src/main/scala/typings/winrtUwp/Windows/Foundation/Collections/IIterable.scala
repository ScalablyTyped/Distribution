package typings.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes an iterator that supports simple iteration over a collection of a specified type. */
@js.native
trait IIterable[T] extends js.Object {
  
  /**
    * Returns an iterator for the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[T] = js.native
}
object IIterable {
  
  @scala.inline
  def apply[T](first: () => IIterator[T]): IIterable[T] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[IIterable[T]]
  }
  
  @scala.inline
  implicit class IIterableOps[Self <: IIterable[_], T] (val x: Self with IIterable[T]) extends AnyVal {
    
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
    def setFirst(value: () => IIterator[T]): Self = this.set("first", js.Any.fromFunction0(value))
  }
}
