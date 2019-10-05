package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleMod

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintASTMod.AST.Range
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleFixer extends js.Object {
  def insertTextAfter(nodeOrToken: Node, text: String): RuleFix = js.native
  def insertTextAfter(nodeOrToken: Token, text: String): RuleFix = js.native
  def insertTextAfterRange(range: Range, text: String): RuleFix = js.native
  def insertTextBefore(nodeOrToken: Node, text: String): RuleFix = js.native
  def insertTextBefore(nodeOrToken: Token, text: String): RuleFix = js.native
  def insertTextBeforeRange(range: Range, text: String): RuleFix = js.native
  def remove(nodeOrToken: Node): RuleFix = js.native
  def remove(nodeOrToken: Token): RuleFix = js.native
  def removeRange(range: Range): RuleFix = js.native
  def replaceText(nodeOrToken: Node, text: String): RuleFix = js.native
  def replaceText(nodeOrToken: Token, text: String): RuleFix = js.native
  def replaceTextRange(range: Range, text: String): RuleFix = js.native
}

