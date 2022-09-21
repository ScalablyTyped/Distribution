package typings.sumoselect

import typings.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def SumoSelect(): JQuery = js.native
  def SumoSelect(option: Option): JQuery = js.native
  
  def on(events: SumoSelectEvents, handler: js.Function1[/* event */ Event, Any]): JQuery = js.native
}
