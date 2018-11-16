package typings
package tslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/enableDisableRules", JSImport.Namespace)
@js.native
object libEnableDisableRulesMod extends js.Object {
  val ENABLE_DISABLE_REGEX: stdLib.RegExp = js.native
  def removeDisabledFailures(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
}

