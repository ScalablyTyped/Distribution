package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var eid: String = js.native
  
  var etype: TerritoryEventType = js.native
  
  var id: js.UndefOr[String] = js.native
}
object Event {
  
  @scala.inline
  def apply(eid: String, etype: TerritoryEventType): Event = {
    val __obj = js.Dynamic.literal(eid = eid.asInstanceOf[js.Any], etype = etype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtype(value: TerritoryEventType): Self = StObject.set(x, "etype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
