package typings.twilioChat

import typings.twilioChat.paginatorMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncpaginatorMod {
  
  /**
    * @classdesc Pagination helper class for Sync
    *
    * @property {Array} items Array of elements on current page
    * @property {boolean} hasNextPage
    * @property {boolean} hasPrevPage
    */
  @JSImport("twilio-chat/lib/syncpaginator", "SyncPaginator")
  @js.native
  class SyncPaginator[T] protected () extends Paginator[T] {
    /**
      * @param {Array} items Array of element for current page
      * @param {Object} params
      */
    def this(items: js.Any, pageSize: js.Any, anchor: js.Any, direction: js.Any, source: js.Any) = this()
    
    @JSName("items")
    def items_MSyncPaginator: js.Array[T] = js.native
    
    var state: js.Any = js.native
  }
}
