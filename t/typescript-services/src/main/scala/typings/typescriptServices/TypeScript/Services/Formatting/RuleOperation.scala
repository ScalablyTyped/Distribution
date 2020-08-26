package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleOperation extends js.Object {
  var Action: RuleAction = js.native
  var Context: RuleOperationContext = js.native
}

object RuleOperation {
  @scala.inline
  def apply(Action: RuleAction, Context: RuleOperationContext): RuleOperation = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperation]
  }
  @scala.inline
  implicit class RuleOperationOps[Self <: RuleOperation] (val x: Self) extends AnyVal {
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
    def setAction(value: RuleAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: RuleOperationContext): Self = this.set("Context", value.asInstanceOf[js.Any])
  }
  
}

