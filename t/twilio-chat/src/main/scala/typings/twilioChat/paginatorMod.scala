package typings.twilioChat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginatorMod {
  
  /**
    * @classdesc Pagination helper class.
    * @alias Paginator
    * @property {Array} items Array of elements of type T on current page
    * @property {boolean} hasNextPage Indicates the existence of next page
    * @property {boolean} hasPrevPage Indicates the existence of previous page
    */
  @JSImport("twilio-chat/lib/interfaces/paginator", "SamplePaginator")
  @js.native
  class SamplePaginator[T] () extends Paginator[T]
  
  @js.native
  trait Paginator[T] extends StObject {
    
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
    implicit class PaginatorMutableBuilder[Self <: Paginator[_], T] (val x: Self with Paginator[T]) extends AnyVal {
      
      @scala.inline
      def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPrevPage(value: Boolean): Self = StObject.set(x, "hasPrevPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setNextPage(value: () => js.Promise[Paginator[T]]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevPage(value: () => js.Promise[Paginator[T]]): Self = StObject.set(x, "prevPage", js.Any.fromFunction0(value))
    }
  }
}
