package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends tslintLib.libLanguageRuleRuleMod.RuleFailure {
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String) = this()
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String, fix: js.Array[tslintLib.libLanguageRuleRuleMod.Replacement]) = this()
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String, fix: tslintLib.libLanguageRuleRuleMod.Replacement) = this()
}

@JSImport("tslint/lib", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: tslintLib.libLanguageRuleRuleMod.RuleFailure, b: tslintLib.libLanguageRuleRuleMod.RuleFailure): scala.Double = js.native
}

