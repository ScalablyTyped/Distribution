package typings.vueInbrowserCompilerUtils.libTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDescriptor
  extends StObject
     with DocBlockTags
     with Descriptor {
  
  var name: String
  
  var properties: js.UndefOr[js.Array[EventProperty]] = js.undefined
  
  var `type`: js.UndefOr[EventType] = js.undefined
}
object EventDescriptor {
  
  inline def apply(name: String): EventDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventDescriptor] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[EventProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: EventProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
