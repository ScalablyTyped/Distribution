package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLanguageRuleRuleMod {
  type Fix = Replacement | js.Array[Replacement]
  type FixJson = ReplacementJson | js.Array[ReplacementJson]
  type RuleSeverity = tslintLib.tslintLibStrings.warning | tslintLib.tslintLibStrings.error | tslintLib.tslintLibStrings.off
  type RuleType = tslintLib.tslintLibStrings.functionality | tslintLib.tslintLibStrings.maintainability | tslintLib.tslintLibStrings.style | tslintLib.tslintLibStrings.typescript | tslintLib.tslintLibStrings.formatting
}
