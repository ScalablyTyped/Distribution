package typings.tslint

import typings.std.RegExp
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/enableDisableRules", JSImport.Namespace)
@js.native
object libEnableDisableRulesMod extends js.Object {
  val ENABLE_DISABLE_REGEX: RegExp = js.native
  def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}

