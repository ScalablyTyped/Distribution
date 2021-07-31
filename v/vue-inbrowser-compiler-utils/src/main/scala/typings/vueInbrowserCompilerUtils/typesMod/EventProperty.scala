package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventProperty extends StObject {
  
  var description: js.UndefOr[String | Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: EventType
}
object EventProperty {
  
  @scala.inline
  def apply(`type`: EventType): EventProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventProperty]
  }
  
  @scala.inline
  implicit class EventPropertyMutableBuilder[Self <: EventProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String | Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
