package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw[Entity] extends StObject {
  
  var entities: js.Array[Entity]
  
  var raw: js.Array[js.Any]
}
object Raw {
  
  inline def apply[Entity](entities: js.Array[Entity], raw: js.Array[js.Any]): Raw[Entity] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw[Entity]]
  }
  
  extension [Self <: Raw[?], Entity](x: Self & Raw[Entity]) {
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setRaw(value: js.Array[js.Any]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawVarargs(value: js.Any*): Self = StObject.set(x, "raw", js.Array(value :_*))
  }
}
