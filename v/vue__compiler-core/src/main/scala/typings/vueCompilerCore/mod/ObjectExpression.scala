package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression
  extends StObject
     with Node2 {
  
  var properties: js.Array[Property]
  
  @JSName("type")
  var type_ObjectExpression: 15
}
object ObjectExpression {
  
  inline def apply(loc: SourceLocation, properties: js.Array[Property]): ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[ObjectExpression]
  }
  
  extension [Self <: ObjectExpression](x: Self) {
    
    inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: 15): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
