package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression
  extends StObject
     with Node2
     with JSChildNode
     with PropsExpression {
  
  var properties: js.Array[Property]
  
  @JSName("type")
  var type_ObjectExpression: `15`
}
object ObjectExpression {
  
  @scala.inline
  def apply(loc: SourceLocation, properties: js.Array[Property]): ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[ObjectExpression]
  }
  
  @scala.inline
  implicit class ObjectExpressionMutableBuilder[Self <: ObjectExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `15`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
