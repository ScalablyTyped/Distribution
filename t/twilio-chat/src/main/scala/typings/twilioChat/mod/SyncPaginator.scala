package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc Pagination helper class for Sync
  *
  * @property {Array} items Array of elements on current page
  * @property {boolean} hasNextPage
  * @property {boolean} hasPrevPage
  */
@js.native
trait SyncPaginator[T]
  extends StObject
     with Paginator[T] {
  
  @JSName("items")
  def items_MSyncPaginator: js.Array[T] = js.native
  
  /* private */ var state: Any = js.native
}
