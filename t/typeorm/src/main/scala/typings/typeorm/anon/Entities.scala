package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entities[Entity, T] extends StObject {
  
  var entities: js.Array[Entity]
  
  var raw: js.Array[T]
}
object Entities {
  
  inline def apply[Entity, T](entities: js.Array[Entity], raw: js.Array[T]): Entities[Entity, T] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities[Entity, T]]
  }
  
  extension [Self <: Entities[?, ?], Entity, T](x: Self & (Entities[Entity, T])) {
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    inline def setRaw(value: js.Array[T]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawVarargs(value: T*): Self = StObject.set(x, "raw", js.Array(value :_*))
  }
}
