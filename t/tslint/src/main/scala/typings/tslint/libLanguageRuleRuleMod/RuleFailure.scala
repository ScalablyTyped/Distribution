package typings.tslint.libLanguageRuleRuleMod

import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/rule", "RuleFailure")
@js.native
class RuleFailure protected () extends js.Object {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: Replacement
  ) = this()
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
  def equals(ruleFailure: RuleFailure): Boolean = js.native
  def getEndPosition(): RuleFailurePosition = js.native
  def getFailure(): String = js.native
  def getFileName(): String = js.native
  def getFix(): js.UndefOr[Replacement | js.Array[Replacement]] = js.native
  def getRawLines(): String = js.native
  def getRuleName(): String = js.native
  def getRuleSeverity(): RuleSeverity = js.native
  def getStartPosition(): RuleFailurePosition = js.native
  def hasFix(): Boolean = js.native
  def setRuleSeverity(value: RuleSeverity): Unit = js.native
  def toJson(): IRuleFailureJson = js.native
}

/* static members */
@JSImport("tslint/lib/language/rule/rule", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: RuleFailure, b: RuleFailure): Double = js.native
}

