package typings.typescriptServices.mod.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.RulesBucket")
@js.native
class RulesBucket ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.RulesBucket {
  /* CompleteClass */
  override var rules: js.Any = js.native
  /* CompleteClass */
  override def AddRule(
    rule: typings.typescriptServices.TypeScript.Services.Formatting.Rule,
    specificTokens: Boolean,
    constructionState: js.Array[
      typings.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
    ],
    rulesBucketIndex: Double
  ): Unit = js.native
  /* CompleteClass */
  override def Rules(): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
}

