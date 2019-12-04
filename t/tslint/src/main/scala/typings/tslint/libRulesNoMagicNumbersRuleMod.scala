package typings.tslint

import typings.std.Set
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.typescript.typescriptMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noMagicNumbersRule", JSImport.Namespace)
@js.native
object libRulesNoMagicNumbersRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ALLOWED_NODES: Set[SyntaxKind] = js.native
    var DEFAULT_ALLOWED: js.Array[Double] = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(num: String): String = js.native
  }
  
}

