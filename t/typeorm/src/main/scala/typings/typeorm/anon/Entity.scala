package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity[E1, E2] extends StObject {
  
  var entity: E1
  
  var related: js.UndefOr[E2 | js.Array[E2]] = js.undefined
}
object Entity {
  
  @scala.inline
  def apply[E1, E2](entity: E1): Entity[E1, E2] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity[E1, E2]]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity[?, ?], E1, E2] (val x: Self & (Entity[E1, E2])) extends AnyVal {
    
    @scala.inline
    def setEntity(value: E1): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelated(value: E2 | js.Array[E2]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: E2*): Self = StObject.set(x, "related", js.Array(value :_*))
  }
}
