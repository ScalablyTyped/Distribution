package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
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
  implicit class ObjectExpressionOps[Self <: ObjectExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `15`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
