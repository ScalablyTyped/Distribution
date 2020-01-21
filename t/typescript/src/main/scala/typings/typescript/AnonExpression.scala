package typings.typescript

import typings.typescript.mod.Identifier
import typings.typescript.mod.PropertyAccessEntityNameExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: Identifier | PropertyAccessEntityNameExpression
}

object AnonExpression {
  @scala.inline
  def apply(expression: Identifier | PropertyAccessEntityNameExpression): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpression]
  }
}

