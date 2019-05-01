package typings
package twilioDashChatLib.libRestpaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends twilioDashChatLib.libInterfacesPaginatorMod.Paginator[T] {
  def this(items: js.Any, source: js.Any, prevToken: js.Any, nextToken: js.Any) = this()
  /* CompleteClass */
  override var hasNextPage: scala.Boolean = js.native
  /* CompleteClass */
  override var hasPrevPage: scala.Boolean = js.native
  /* CompleteClass */
  override var items: js.Array[T] = js.native
  var state: js.Any = js.native
  /**
    * Request next page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  /* CompleteClass */
  override def nextPage(): js.Promise[twilioDashChatLib.libInterfacesPaginatorMod.Paginator[T]] = js.native
  /**
    * Request previous page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  /* CompleteClass */
  override def prevPage(): js.Promise[twilioDashChatLib.libInterfacesPaginatorMod.Paginator[T]] = js.native
}

