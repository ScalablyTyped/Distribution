package typings.tslint.tslintMod

import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends typings.tslint.libLanguageRuleRuleMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typings.tslint.libLanguageRuleRuleMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typings.tslint.libLanguageRuleRuleMod.Replacement
  ) = this()
}

/* static members */
@JSImport("tslint", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(
    a: typings.tslint.libLanguageRuleRuleMod.RuleFailure,
    b: typings.tslint.libLanguageRuleRuleMod.RuleFailure
  ): Double = js.native
}

