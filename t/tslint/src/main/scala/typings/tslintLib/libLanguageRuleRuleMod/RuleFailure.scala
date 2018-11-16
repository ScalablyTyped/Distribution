package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/rule", "RuleFailure")
@js.native
class RuleFailure protected () extends js.Object {
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String) = this()
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String, fix: js.Array[Replacement]) = this()
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String, fix: Replacement) = this()
  var createFailurePosition: js.Any = js.native
  val endPosition: js.Any = js.native
  val failure: js.Any = js.native
  val fileName: js.Any = js.native
  val fix: js.UndefOr[js.Any] = js.native
  val rawLines: js.Any = js.native
  val ruleName: js.Any = js.native
  var ruleSeverity: js.Any = js.native
  val sourceFile: js.Any = js.native
  val startPosition: js.Any = js.native
  def equals(ruleFailure: RuleFailure): scala.Boolean = js.native
  def getEndPosition(): RuleFailurePosition = js.native
  def getFailure(): java.lang.String = js.native
  def getFileName(): java.lang.String = js.native
  def getFix(): js.UndefOr[Replacement | js.Array[Replacement]] = js.native
  def getRawLines(): java.lang.String = js.native
  def getRuleName(): java.lang.String = js.native
  def getRuleSeverity(): RuleSeverity = js.native
  def getStartPosition(): RuleFailurePosition = js.native
  def hasFix(): scala.Boolean = js.native
  def setRuleSeverity(value: RuleSeverity): scala.Unit = js.native
  def toJson(): IRuleFailureJson = js.native
}

@JSImport("tslint/lib/language/rule/rule", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: tslintLib.libLanguageRuleRuleMod.RuleFailure, b: tslintLib.libLanguageRuleRuleMod.RuleFailure): scala.Double = js.native
}

