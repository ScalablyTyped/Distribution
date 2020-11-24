package typings.twilioChat.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paginator[T] extends js.Object {
  
  var hasNextPage: Boolean = js.native
  
  var hasPrevPage: Boolean = js.native
  
  var items: js.Array[T] = js.native
  
  /**
    * Request next page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def nextPage(): js.Promise[Paginator[T]] = js.native
  
  /**
    * Request previous page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def prevPage(): js.Promise[Paginator[T]] = js.native
}
object Paginator {
  
  @scala.inline
  def apply[T](
    hasNextPage: Boolean,
    hasPrevPage: Boolean,
    items: js.Array[T],
    nextPage: () => js.Promise[Paginator[T]],
    prevPage: () => js.Promise[Paginator[T]]
  ): Paginator[T] = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), prevPage = js.Any.fromFunction0(prevPage))
    __obj.asInstanceOf[Paginator[T]]
  }
  
  @scala.inline
  implicit class PaginatorOps[Self <: Paginator[_], T] (val x: Self with Paginator[T]) extends AnyVal {
    
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
    def setHasNextPage(value: Boolean): Self = this.set("hasNextPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrevPage(value: Boolean): Self = this.set("hasPrevPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPage(value: () => js.Promise[Paginator[T]]): Self = this.set("nextPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevPage(value: () => js.Promise[Paginator[T]]): Self = this.set("prevPage", js.Any.fromFunction0(value))
  }
}
