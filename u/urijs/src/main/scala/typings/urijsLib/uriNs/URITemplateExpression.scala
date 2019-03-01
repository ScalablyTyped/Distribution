package typings
package urijsLib.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URITemplateExpression extends js.Object {
  var expression: java.lang.String
  var operator: java.lang.String
  var variables: js.Array[URITemplateVariable]
}

object URITemplateExpression {
  @scala.inline
  def apply(expression: java.lang.String, operator: java.lang.String, variables: js.Array[URITemplateVariable]): URITemplateExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[URITemplateExpression]
  }
}

