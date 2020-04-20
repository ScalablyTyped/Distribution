package typings.twilioChat

import typings.twilioChat.paginatorMod.Paginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/restpaginator", JSImport.Namespace)
@js.native
object restpaginatorMod extends js.Object {
  /**
    * @class Paginator
    * @classdesc Pagination helper class
    *
    * @property {Array} items Array of elements on current page
    * @property {boolean} hasNextPage Indicates the existence of next page
    * @property {boolean} hasPrevPage Indicates the existence of previous page
    */
  @js.native
  class RestPaginator[T] protected () extends Paginator[T] {
    def this(items: js.Any, source: js.Any, prevToken: js.Any, nextToken: js.Any) = this()
    /* CompleteClass */
    override var hasNextPage: Boolean = js.native
    /* CompleteClass */
    override var hasPrevPage: Boolean = js.native
    /* CompleteClass */
    override var items: js.Array[T] = js.native
    var state: js.Any = js.native
    @JSName("hasNextPage")
    def hasNextPage_MRestPaginator: Boolean = js.native
    @JSName("hasPrevPage")
    def hasPrevPage_MRestPaginator: Boolean = js.native
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
  }
  
}

