package typings.twilioChat

import typings.twilioChat.paginatorMod.Paginator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/syncpaginator", JSImport.Namespace)
@js.native
object syncpaginatorMod extends js.Object {
  /**
    * @classdesc Pagination helper class for Sync
    *
    * @property {Array} items Array of elements on current page
    * @property {boolean} hasNextPage
    * @property {boolean} hasPrevPage
    */
  @js.native
  class SyncPaginator[T] protected () extends Paginator[T] {
    /**
      * @param {Array} items Array of element for current page
      * @param {Object} params
      */
    def this(items: js.Any, pageSize: js.Any, anchor: js.Any, direction: js.Any, source: js.Any) = this()
    /* CompleteClass */
    override var hasNextPage: Boolean = js.native
    /* CompleteClass */
    override var hasPrevPage: Boolean = js.native
    /* CompleteClass */
    override var items: js.Array[T] = js.native
    var state: js.Any = js.native
    @JSName("items")
    def items_MSyncPaginator: js.Array[T] = js.native
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

