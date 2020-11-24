package typings.tslint

import typings.std.RegExp
import typings.tslint.ruleMod.RuleFailure
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/enableDisableRules", JSImport.Namespace)
@js.native
object enableDisableRulesMod extends js.Object {
  
  val ENABLE_DISABLE_REGEX: RegExp = js.native
  
  def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}
