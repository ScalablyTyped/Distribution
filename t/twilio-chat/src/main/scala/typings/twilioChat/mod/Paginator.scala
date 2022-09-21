package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination helper class.
  *
  * @interface
  * @property {Array} items Elements on current page
  * @property {boolean} hasNextPage Indicates the existence of next page
  * @property {boolean} hasPrevPage Indicates the existence of previous page
  * @function {Promise<Paginator>} nextPage() Request next page. Does not modify existing object
  * @function {Promise<Paginator>} prevPage() Request previous page. Does not modify existing object
  */
trait Paginator[T] extends StObject {
  
  var hasNextPage: Boolean
  
  var hasPrevPage: Boolean
  
  var items: js.Array[T]
  
  /**
    * Request next page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def nextPage(): js.Promise[Paginator[T]]
  
  /**
    * Request previous page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def prevPage(): js.Promise[Paginator[T]]
}
object Paginator {
  
  inline def apply[T](
    hasNextPage: Boolean,
    hasPrevPage: Boolean,
    items: js.Array[T],
    nextPage: () => js.Promise[Paginator[T]],
    prevPage: () => js.Promise[Paginator[T]]
  ): Paginator[T] = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), prevPage = js.Any.fromFunction0(prevPage))
    __obj.asInstanceOf[Paginator[T]]
  }
  
  extension [Self <: Paginator[?], T](x: Self & Paginator[T]) {
    
    inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
    
    inline def setHasPrevPage(value: Boolean): Self = StObject.set(x, "hasPrevPage", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextPage(value: () => js.Promise[Paginator[T]]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
    
    inline def setPrevPage(value: () => js.Promise[Paginator[T]]): Self = StObject.set(x, "prevPage", js.Any.fromFunction0(value))
  }
}
