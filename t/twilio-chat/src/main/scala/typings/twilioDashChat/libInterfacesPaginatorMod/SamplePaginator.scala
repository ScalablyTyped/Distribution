package typings.twilioDashChat.libInterfacesPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc Pagination helper class.
  * @alias Paginator
  * @property {Array} items Array of elements of type T on current page
  * @property {boolean} hasNextPage Indicates the existence of next page
  * @property {boolean} hasPrevPage Indicates the existence of previous page
  */
@JSImport("twilio-chat/lib/interfaces/paginator", "SamplePaginator")
@js.native
class SamplePaginator[T] () extends Paginator[T] {
  /* CompleteClass */
  override var hasNextPage: Boolean = js.native
  /* CompleteClass */
  override var hasPrevPage: Boolean = js.native
  /* CompleteClass */
  override var items: js.Array[T] = js.native
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

