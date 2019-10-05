package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintASTMod.AST.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleFix extends js.Object {
  var range: Range
  var text: String
}

object RuleFix {
  @scala.inline
  def apply(range: Range, text: String): RuleFix = {
    val __obj = js.Dynamic.literal(range = range, text = text)
  
    __obj.asInstanceOf[RuleFix]
  }
}

