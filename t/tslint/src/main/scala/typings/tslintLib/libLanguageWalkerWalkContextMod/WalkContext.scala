package typings
package tslintLib.libLanguageWalkerWalkContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/walkContext", "WalkContext")
@js.native
class WalkContext[T] protected () extends js.Object {
  def this(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, ruleName: java.lang.String, options: T) = this()
  val failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  val options: T = js.native
  val ruleName: java.lang.String = js.native
  val sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def addFailure(start: scala.Double, end: scala.Double, failure: java.lang.String): scala.Unit = js.native
  def addFailure(
    start: scala.Double,
    end: scala.Double,
    failure: java.lang.String,
    fix: tslintLib.libLanguageRuleRuleMod.Fix
  ): scala.Unit = js.native
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
}

