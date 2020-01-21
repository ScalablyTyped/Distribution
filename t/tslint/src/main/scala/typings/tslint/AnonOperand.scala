package typings.tslint

import typings.typescript.mod.NumericLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperand extends js.Object {
  var operand: NumericLiteral
}

object AnonOperand {
  @scala.inline
  def apply(operand: NumericLiteral): AnonOperand = {
    val __obj = js.Dynamic.literal(operand = operand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOperand]
  }
}

