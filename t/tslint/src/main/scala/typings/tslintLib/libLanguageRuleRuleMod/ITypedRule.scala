package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedRule extends IRule {
  def applyWithProgram(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    program: typescriptLib.typescriptMod.tsNs.Program
  ): js.Array[RuleFailure]
}

