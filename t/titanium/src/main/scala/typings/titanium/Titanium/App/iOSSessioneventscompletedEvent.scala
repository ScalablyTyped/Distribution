package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired to indicate that all messages enqueued for a [urlSession](Modules.URLSession) have been delivered.
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSSessioneventscompletedEvent extends iOSBaseEvent {
  
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String = js.native
}
object iOSSessioneventscompletedEvent {
  
  @scala.inline
  def apply(sessionIdentifier: String, source: iOS): iOSSessioneventscompletedEvent = {
    val __obj = js.Dynamic.literal(sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSSessioneventscompletedEvent]
  }
  
  @scala.inline
  implicit class iOSSessioneventscompletedEventMutableBuilder[Self <: iOSSessioneventscompletedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionIdentifier(value: String): Self = StObject.set(x, "sessionIdentifier", value.asInstanceOf[js.Any])
  }
}
