package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var eid: String
  
  var etype: TerritoryEventType
  
  var id: js.UndefOr[String] = js.undefined
}
object Event {
  
  inline def apply(eid: String, etype: TerritoryEventType): Event = {
    val __obj = js.Dynamic.literal(eid = eid.asInstanceOf[js.Any], etype = etype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setEid(value: String): Self = StObject.set(x, "eid", value.asInstanceOf[js.Any])
    
    inline def setEtype(value: TerritoryEventType): Self = StObject.set(x, "etype", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
