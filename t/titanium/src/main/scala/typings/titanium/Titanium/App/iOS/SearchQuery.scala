package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.completed
import typings.titanium.titaniumStrings.founditems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A search query object manages the criteria to apply when searching app content that you have previously
  * indexed by using the Core Spotlight APIs.
  */
@js.native
trait SearchQuery extends Proxy {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_completed(
    name: completed,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryCompletedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_founditems(
    name: founditems,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryFounditemsEvent, Unit]
  ): Unit = js.native
  
  /**
    * An array of strings that represent the attributes of indexed items.
    */
  var attributes: js.Array[String] = js.native
  
  /**
    * Cancels a query operation.
    */
  def cancel(): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_completed(name: completed): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_completed(name: completed, event: SearchQueryCompletedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_founditems(name: founditems): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_founditems(name: founditems, event: SearchQueryFounditemsEvent): Unit = js.native
  
  /**
    * A Boolean value that indicates if the query has been cancelled (`true`) or not (`false`).
    */
  def isCancelled(): Boolean = js.native
  
  /**
    * A formatted string that defines the matching criteria to apply to indexed items.
    */
  var queryString: String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_completed(
    name: completed,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryCompletedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_founditems(
    name: founditems,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchQueryFounditemsEvent, Unit]
  ): Unit = js.native
  
  /**
    * Asynchronously queries the index for items that match the query object's specifications.
    */
  def start(): Unit = js.native
}
