package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotsObjectExpression
  extends ObjectExpression
     with SlotsExpression {
  
  @JSName("properties")
  var properties_SlotsObjectExpression: js.Array[SlotsObjectProperty] = js.native
}
object SlotsObjectExpression {
  
  @scala.inline
  def apply(loc: SourceLocation, properties: js.Array[SlotsObjectProperty], `type`: `15`): SlotsObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotsObjectExpression]
  }
  
  @scala.inline
  implicit class SlotsObjectExpressionOps[Self <: SlotsObjectExpression] (val x: Self) extends AnyVal {
    
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
    def setPropertiesVarargs(value: SlotsObjectProperty*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[SlotsObjectProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
