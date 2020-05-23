package typings.typescriptServices.mod.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.RuleOperationContext")
@js.native
class RuleOperationContext protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext {
  def this(funcs: (js.Function1[
        /* context */ typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext, 
        Boolean
      ])*) = this()
  /* CompleteClass */
  override var customContextChecks: js.Any = js.native
  /* CompleteClass */
  override def InContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  /* CompleteClass */
  override def IsAny(): Boolean = js.native
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.RuleOperationContext")
@js.native
object RuleOperationContext extends js.Object {
  var Any: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
}

