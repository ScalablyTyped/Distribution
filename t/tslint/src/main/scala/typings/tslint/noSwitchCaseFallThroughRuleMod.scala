package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.walkerWalkerMod.AbstractWalker
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", JSImport.Namespace)
@js.native
object noSwitchCaseFallThroughRuleMod extends js.Object {
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

