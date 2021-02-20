package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Raw[Entity] extends StObject {
  
  var entities: js.Array[Entity] = js.native
  
  var raw: js.Array[_] = js.native
}
object Raw {
  
  @scala.inline
  def apply[Entity](entities: js.Array[Entity], raw: js.Array[_]): Raw[Entity] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw[Entity]]
  }
  
  @scala.inline
  implicit class RawMutableBuilder[Self <: Raw[_], Entity] (val x: Self with Raw[Entity]) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Array[_]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawVarargs(value: js.Any*): Self = StObject.set(x, "raw", js.Array(value :_*))
  }
}
