package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libLanguageWalkerWalkerMod.AbstractWalker
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.typescript.typescriptMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", JSImport.Namespace)
@js.native
object libRulesNoSwitchCaseFallThroughRuleMod extends js.Object {
  @js.native
  class NoSwitchCaseFallThroughWalker ()
    extends AbstractWalker[js.UndefOr[scala.Nothing]] {
    var isFallThroughAllowed: js.Any = js.native
    var visitSwitchStatement: js.Any = js.native
  }
  
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(keyword: SyntaxKind): String = js.native
  }
  
}

