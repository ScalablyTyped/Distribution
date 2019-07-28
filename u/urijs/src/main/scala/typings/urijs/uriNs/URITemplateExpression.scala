package typings.urijs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URITemplateExpression extends js.Object {
  var expression: String
  var operator: String
  var variables: js.Array[URITemplateVariable]
}

object URITemplateExpression {
  @scala.inline
  def apply(expression: String, operator: String, variables: js.Array[URITemplateVariable]): URITemplateExpression = {
    val __obj = js.Dynamic.literal(expression = expression, operator = operator, variables = variables)
  
    __obj.asInstanceOf[URITemplateExpression]
  }
}

