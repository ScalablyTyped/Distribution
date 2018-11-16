package typings
package tslintLib.tslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LintResult extends js.Object {
  var errorCount: scala.Double
  var failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  var fixes: js.UndefOr[js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]] = js.undefined
  var format: java.lang.String | tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor
  var output: java.lang.String
  var warningCount: scala.Double
}

