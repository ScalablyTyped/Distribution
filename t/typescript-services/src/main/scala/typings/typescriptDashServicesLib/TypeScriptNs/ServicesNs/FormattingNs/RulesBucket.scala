package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RulesBucket")
@js.native
class RulesBucket () extends js.Object {
  var rules: js.Any = js.native
  def AddRule(
    rule: Rule,
    specificTokens: scala.Boolean,
    constructionState: js.Array[RulesBucketConstructionState],
    rulesBucketIndex: scala.Double
  ): scala.Unit = js.native
  def Rules(): js.Array[Rule] = js.native
}

