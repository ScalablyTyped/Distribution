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
    var state: js.Any = js.native
    @JSName("items")
    def items_MSyncPaginator: js.Array[T] = js.native
  }
  
}

