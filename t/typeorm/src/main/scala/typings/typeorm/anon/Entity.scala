package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity[E1, E2] extends StObject {
  
  var entity: E1
  
  var related: js.UndefOr[E2 | js.Array[E2]] = js.undefined
}
object Entity {
  
  inline def apply[E1, E2](entity: E1): Entity[E1, E2] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity[E1, E2]]
  }
  
  extension [Self <: Entity[?, ?], E1, E2](x: Self & (Entity[E1, E2])) {
    
    inline def setEntity(value: E1): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setRelated(value: E2 | js.Array[E2]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: E2*): Self = StObject.set(x, "related", js.Array(value :_*))
  }
}
