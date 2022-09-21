package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination helper class.
  */
@JSImport("twilio-chat", "RestPaginator")
@js.native
open class RestPaginator[T] protected ()
  extends StObject
     with Paginator[T] {
  /**
    * @internal
    */
  def this(items: Any, source: Any, prevToken: Any, nextToken: Any) = this()
  
  /* CompleteClass */
  var hasNextPage: Boolean = js.native
  /**
    * Indicates the existence of the next page.
    */
  @JSName("hasNextPage")
  def hasNextPage_MRestPaginator: Boolean = js.native
  
  /* CompleteClass */
  var hasPrevPage: Boolean = js.native
  /**
    * Indicates the existence of the previous page
    */
  @JSName("hasPrevPage")
  def hasPrevPage_MRestPaginator: Boolean = js.native
  
  /* CompleteClass */
  var items: js.Array[T] = js.native
  /**
    * Array of elements on the current page.
    */
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
  
  /* private */ var state: Any = js.native
}
