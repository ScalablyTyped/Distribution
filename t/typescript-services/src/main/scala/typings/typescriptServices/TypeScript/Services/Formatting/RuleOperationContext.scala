package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
@js.native
class RuleOperationContext protected () extends js.Object {
  def this(funcs: (js.Function1[/* context */ FormattingContext, Boolean])*) = this()
  var customContextChecks: js.Any = js.native
  def InContext(context: FormattingContext): Boolean = js.native
  def IsAny(): Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
@js.native
object RuleOperationContext extends js.Object {
  var Any: RuleOperationContext = js.native
}

