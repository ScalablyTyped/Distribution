package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOperationContext extends js.Object {
  var customContextChecks: js.Any
  def InContext(context: FormattingContext): Boolean
  def IsAny(): Boolean
}

object RuleOperationContext {
  @scala.inline
  def apply(InContext: FormattingContext => Boolean, IsAny: () => Boolean, customContextChecks: js.Any): RuleOperationContext = {
    val __obj = js.Dynamic.literal(InContext = js.Any.fromFunction1(InContext), IsAny = js.Any.fromFunction0(IsAny), customContextChecks = customContextChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperationContext]
  }
}

