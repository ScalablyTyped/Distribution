package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOperation extends js.Object {
  var Action: RuleAction
  var Context: RuleOperationContext
}

object RuleOperation {
  @scala.inline
  def apply(Action: RuleAction, Context: RuleOperationContext): RuleOperation = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperation]
  }
}

