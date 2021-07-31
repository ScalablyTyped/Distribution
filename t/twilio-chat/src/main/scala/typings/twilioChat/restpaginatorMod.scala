package typings.twilioChat

import typings.twilioChat.paginatorMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restpaginatorMod {
  
  /**
    * @class Paginator
    * @classdesc Pagination helper class
    *
    * @property {Array} items Array of elements on current page
    * @property {boolean} hasNextPage Indicates the existence of next page
    * @property {boolean} hasPrevPage Indicates the existence of previous page
    */
  @JSImport("twilio-chat/lib/restpaginator", "RestPaginator")
  @js.native
  class RestPaginator[T] protected ()
    extends StObject
       with Paginator[T] {
    def this(items: js.Any, source: js.Any, prevToken: js.Any, nextToken: js.Any) = this()
    
    /* CompleteClass */
    var hasNextPage: Boolean = js.native
    @JSName("hasNextPage")
    def hasNextPage_MRestPaginator: Boolean = js.native
    
    /* CompleteClass */
    var hasPrevPage: Boolean = js.native
    @JSName("hasPrevPage")
    def hasPrevPage_MRestPaginator: Boolean = js.native
    
    /* CompleteClass */
    var items: js.Array[T] = js.native
    @JSName("items")
    def items_MRestPaginator: js.Array[T] = js.native
    
    /**
      * Request next page.
      * Does not modify existing object.
      * @return {Promise<Paginator<T>>}
      */
    /* CompleteClass */
    override def nextPage(): js.Promise[Paginator[T]] = js.native
    
    /**
      * Request previous page.
      * Does not modify existing object.
      * @return {Promise<Paginator<T>>}
      */
    /* CompleteClass */
    override def prevPage(): js.Promise[Paginator[T]] = js.native
    
    var state: js.Any = js.native
  }
}
