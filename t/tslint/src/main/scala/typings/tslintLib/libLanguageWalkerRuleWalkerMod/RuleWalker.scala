package typings
package tslintLib.libLanguageWalkerRuleWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/ruleWalker", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends tslintLib.libLanguageWalkerSyntaxWalkerMod.SyntaxWalker
     with tslintLib.libLanguageWalkerWalkerMod.IWalker {
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, options: tslintLib.libLanguageRuleRuleMod.IOptions) = this()
  val failures: js.Any = js.native
  val limit: js.Any = js.native
  val options: js.UndefOr[js.Any] = js.native
  val ruleName: js.Any = js.native
  val sourceFile: js.Any = js.native
  /** @deprecated Prefer `addFailureAt` and its variants. */
  def addFailure(failure: tslintLib.libLanguageRuleRuleMod.RuleFailure): scala.Unit = js.native
  /** Add a failure with any arbitrary span. Prefer `addFailureAtNode` if possible. */
  def addFailureAt(start: scala.Double, width: scala.Double, failure: java.lang.String): scala.Unit = js.native
  /** Add a failure with any arbitrary span. Prefer `addFailureAtNode` if possible. */
  def addFailureAt(
    start: scala.Double,
    width: scala.Double,
    failure: java.lang.String,
    fix: tslintLib.libLanguageRuleRuleMod.Fix
  ): scala.Unit = js.native
  /** Add a failure using a node's span. */
  def addFailureAtNode(node: typescriptLib.typescriptMod.tsNs.Node, failure: java.lang.String): scala.Unit = js.native
  /** Add a failure using a node's span. */
  def addFailureAtNode(
    node: typescriptLib.typescriptMod.tsNs.Node,
    failure: java.lang.String,
    fix: tslintLib.libLanguageRuleRuleMod.Fix
  ): scala.Unit = js.native
  /** Like `addFailureAt` but uses start and end instead of start and width. */
  def addFailureFromStartToEnd(start: scala.Double, end: scala.Double, failure: java.lang.String): scala.Unit = js.native
  /** Like `addFailureAt` but uses start and end instead of start and width. */
  def addFailureFromStartToEnd(
    start: scala.Double,
    end: scala.Double,
    failure: java.lang.String,
    fix: tslintLib.libLanguageRuleRuleMod.Fix
  ): scala.Unit = js.native
  def appendText(start: scala.Double, text: java.lang.String): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  /** @deprecated Prefer `addFailureAt` and its variants. */
  def createFailure(start: scala.Double, width: scala.Double, failure: java.lang.String): tslintLib.libLanguageRuleRuleMod.RuleFailure = js.native
  /** @deprecated Prefer `addFailureAt` and its variants. */
  def createFailure(
    start: scala.Double,
    width: scala.Double,
    failure: java.lang.String,
    fix: tslintLib.libLanguageRuleRuleMod.Fix
  ): tslintLib.libLanguageRuleRuleMod.RuleFailure = js.native
  def createReplacement(start: scala.Double, length: scala.Double, text: java.lang.String): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def deleteFromTo(start: scala.Double, end: scala.Double): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def deleteText(start: scala.Double, length: scala.Double): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  /* CompleteClass */
  override def getFailures(): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  def getLimit(): scala.Double = js.native
  def getLineAndCharacterOfPosition(position: scala.Double): typescriptLib.typescriptMod.tsNs.LineAndCharacter = js.native
  def getOptions(): js.Any = js.native
  def getRuleName(): java.lang.String = js.native
  /* CompleteClass */
  override def getSourceFile(): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def hasOption(option: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def walk(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): scala.Unit = js.native
}

