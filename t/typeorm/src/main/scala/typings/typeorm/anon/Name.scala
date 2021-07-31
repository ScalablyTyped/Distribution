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
  
  @scala.inline
  def apply[Entity](name: String, `type`: Entity): Name[Entity] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[Entity]]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name[?], Entity] (val x: Self & Name[Entity]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Entity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
