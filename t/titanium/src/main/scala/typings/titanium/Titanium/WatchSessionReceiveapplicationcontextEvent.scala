package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App received app context from apple watch. Will be called on startup if an applicationContext is available.
  */
@js.native
trait WatchSessionReceiveapplicationcontextEvent extends WatchSessionBaseEvent {
  
  /**
    * The application Context
    */
  var applicationContext: js.Any = js.native
}
object WatchSessionReceiveapplicationcontextEvent {
  
  @scala.inline
  def apply(applicationContext: js.Any, source: WatchSession): WatchSessionReceiveapplicationcontextEvent = {
    val __obj = js.Dynamic.literal(applicationContext = applicationContext.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceiveapplicationcontextEvent]
  }
  
  @scala.inline
  implicit class WatchSessionReceiveapplicationcontextEventMutableBuilder[Self <: WatchSessionReceiveapplicationcontextEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationContext(value: js.Any): Self = StObject.set(x, "applicationContext", value.asInstanceOf[js.Any])
  }
}
