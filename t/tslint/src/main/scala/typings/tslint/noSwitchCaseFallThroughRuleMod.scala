package typings.tslint

import typings.tslint.mod.AbstractWalker
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSwitchCaseFallThroughRuleMod {
  
  @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "NoSwitchCaseFallThroughWalker")
  @js.native
  class NoSwitchCaseFallThroughWalker protected ()
    extends AbstractWalker[js.UndefOr[scala.Nothing]] {
    def this(sourceFile: SourceFile, ruleName: String, options: js.UndefOr[scala.Nothing]) = this()
    
    var isFallThroughAllowed: js.Any = js.native
    
    var visitSwitchStatement: js.Any = js.native
  }
  
  @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING(keyword: SyntaxKind): String = js.native
    
    @JSImport("tslint/lib/rules/noSwitchCaseFallThroughRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
