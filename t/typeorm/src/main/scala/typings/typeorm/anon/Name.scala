package typings.typeorm.anon

import typings.typeorm.commonEntityTargetMod._EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name[Entity]
  extends StObject
     with _EntityTarget[Entity]
     with typings.typeorm.entityTargetMod._EntityTarget[Entity] {
  
  var name: String
  
  var `type`: Entity
}
object Name {
  
  inline def apply[Entity](name: String, `type`: Entity): Name[Entity] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[Entity]]
  }
  
  extension [Self <: Name[?], Entity](x: Self & Name[Entity]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Entity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
