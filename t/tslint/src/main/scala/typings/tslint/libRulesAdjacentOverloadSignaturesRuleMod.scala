package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.typescript.typescriptMod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/adjacentOverloadSignaturesRule", JSImport.Namespace)
@js.native
object libRulesAdjacentOverloadSignaturesRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  def getOverloadKey(node: SignatureDeclaration): js.UndefOr[String] = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(name: String): String = js.native
  }
  
}

