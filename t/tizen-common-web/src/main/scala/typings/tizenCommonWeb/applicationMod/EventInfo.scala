package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInfo extends StObject {
  
  /**
    * The unique identifier of the application which is broadcasting an event.
    *
    * An application can listen to events from other applications. However, it can only broadcast its own events. Therefore, when broadcasting an event, this dictionary member must be the identifier of the application which is broadcasting the event.
    *
    * System events do not require an application identifier to be specified. If one is specified, the event will be interpreted as an user event.
    */
  var appId: ApplicationId = js.native
  
  /**
    * Name which describes the event.
    *
    * Must only contain the ASCII characters "[A-Z][a-z][0-9]_" and may not begin with a digit.
    * Must be at least 1 byte in length and not exceed the maximum name length of 127 bytes.
    */
  var name: String = js.native
}
object EventInfo {
  
  @scala.inline
  def apply(appId: ApplicationId, name: String): EventInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInfo]
  }
  
  @scala.inline
  implicit class EventInfoMutableBuilder[Self <: EventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: ApplicationId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
