package typings.tslint

import typings.std.RegExp
import typings.tslint.ruleMod.RuleFailure
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableDisableRulesMod {
  
  @JSImport("tslint/lib/enableDisableRules", "ENABLE_DISABLE_REGEX")
  @js.native
  val ENABLE_DISABLE_REGEX: RegExp = js.native
  
  @JSImport("tslint/lib/enableDisableRules", "removeDisabledFailures")
  @js.native
  def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}
