package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: typescriptLib.typescriptMod.Identifier | typescriptLib.typescriptMod.PropertyAccessEntityNameExpression
}

object Anon_Expression {
  @scala.inline
  def apply(
    expression: typescriptLib.typescriptMod.Identifier | typescriptLib.typescriptMod.PropertyAccessEntityNameExpression
  ): Anon_Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Expression]
  }
}

