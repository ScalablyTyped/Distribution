package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination helper class.
  */
@JSImport("twilio-sync", "Paginator")
@js.native
open class Paginator[Item] protected () extends StObject {
  /**
    * @internal
    */
  def this(items: Any, source: Any, prevToken: String, nextToken: String) = this()
  
  /**
    * Indicates the existence of the next page.
    */
  def hasNextPage: Boolean = js.native
  
  /**
    * Indicates the existence of the previous page.
    */
  def hasPrevPage: Boolean = js.native
  
  /**
    * Array of elements on current page.
    */
  val items: js.Array[Item] = js.native
  
  /**
    * Request next page.
    * Does not modify existing object.
    */
  def nextPage(): js.Promise[Paginator[Item]] = js.native
  
  /* private */ var nextToken: Any = js.native
  
  /**
    * Request previous page.
    * Does not modify existing object.
    */
  def prevPage(): js.Promise[Paginator[Item]] = js.native
  
  /* private */ var prevToken: Any = js.native
  
  /* private */ var source: Any = js.native
}
