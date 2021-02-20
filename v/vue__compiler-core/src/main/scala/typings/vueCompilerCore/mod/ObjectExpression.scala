package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExpression
  extends JSChildNode
     with Node2
     with PropsExpression {
  
  var properties: js.Array[Property] = js.native
  
  @JSName("type")
  var type_ObjectExpression: `15` = js.native
}
object ObjectExpression {
  
  @scala.inline
  def apply(loc: SourceLocation, properties: js.Array[Property], `type`: `15`): ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
