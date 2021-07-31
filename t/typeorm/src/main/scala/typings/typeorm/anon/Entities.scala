package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entities[Entity, T] extends StObject {
  
  var entities: js.Array[Entity]
  
  var raw: js.Array[T]
}
object Entities {
  
  @scala.inline
  def apply[Entity, T](entities: js.Array[Entity], raw: js.Array[T]): Entities[Entity, T] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities[Entity, T]]
  }
  
  @scala.inline
  implicit class EntitiesMutableBuilder[Self <: Entities[?, ?], Entity, T] (val x: Self & (Entities[Entity, T])) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Array[T]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawVarargs(value: T*): Self = StObject.set(x, "raw", js.Array(value :_*))
  }
}
