package typings.urijs.uritemplateMod

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
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[URITemplateExpression]
  }
}

