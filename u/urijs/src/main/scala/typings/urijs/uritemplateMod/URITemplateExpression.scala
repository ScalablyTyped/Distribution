package typings.urijs.uritemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URITemplateExpression extends js.Object {
  
  var expression: String = js.native
  
  var operator: String = js.native
  
  var variables: js.Array[URITemplateVariable] = js.native
}
object URITemplateExpression {
  
  @scala.inline
  def apply(expression: String, operator: String, variables: js.Array[URITemplateVariable]): URITemplateExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[URITemplateExpression]
  }
  
  @scala.inline
  implicit class URITemplateExpressionOps[Self <: URITemplateExpression] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: URITemplateVariable*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[URITemplateVariable]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
