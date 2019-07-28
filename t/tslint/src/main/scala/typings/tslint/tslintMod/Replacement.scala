package typings.tslint.tslintMod

import typings.tslint.libLanguageRuleRuleMod.Fix
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Replacement")
@js.native
class Replacement protected ()
  extends typings.tslint.libLanguageRuleRuleMod.Replacement {
  def this(start: Double, length: Double, text: String) = this()
}

/* static members */
@JSImport("tslint", "Replacement")
@js.native
object Replacement extends js.Object {
  def appendText(start: Double, text: String): typings.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def applyAll(content: String, replacements: js.Array[typings.tslint.libLanguageRuleRuleMod.Replacement]): String = js.native
  def applyFixes(content: String, fixes: js.Array[Fix]): String = js.native
  def deleteFromTo(start: Double, end: Double): typings.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def deleteText(start: Double, length: Double): typings.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def replaceFromTo(start: Double, end: Double, text: String): typings.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def replaceNode(node: Node, text: String): typings.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def replaceNode(node: Node, text: String, sourceFile: SourceFile): typings.tslint.libLanguageRuleRuleMod.Replacement = js.native
}

