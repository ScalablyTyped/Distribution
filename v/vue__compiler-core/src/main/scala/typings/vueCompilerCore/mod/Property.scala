package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property
  extends StObject
     with Node2 {
  
  var key: ExpressionNode
  
  @JSName("type")
  var type_Property: 16
  
  var value: JSChildNode
}
object Property {
  
  inline def apply(key: ExpressionNode, loc: SourceLocation, value: JSChildNode): Property = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(16)
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setKey(value: ExpressionNode): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: 16): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JSChildNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
