package typings.velocityjs

import typings.velocityjs.anon.Firstcolumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VELOCITY_AST extends StObject {
  
  var id: String
  
  var pos: Firstcolumn
  
  var `type`: AST_TYPE
  
  var value: Any
}
object VELOCITY_AST {
  
  inline def apply(id: String, pos: Firstcolumn, `type`: AST_TYPE, value: Any): VELOCITY_AST = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VELOCITY_AST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VELOCITY_AST] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Firstcolumn): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setType(value: AST_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
