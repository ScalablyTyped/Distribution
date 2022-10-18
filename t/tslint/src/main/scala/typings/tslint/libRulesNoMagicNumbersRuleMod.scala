package typings.tslint

import typings.std.Set
import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoMagicNumbersRuleMod {
  
  @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.ALLOWED_NODES")
    @js.native
    def ALLOWED_NODES: Set[SyntaxKind] = js.native
    inline def ALLOWED_NODES_=(x: Set[SyntaxKind]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_NODES")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.DEFAULT_ALLOWED")
    @js.native
    def DEFAULT_ALLOWED: js.Array[Double] = js.native
    inline def DEFAULT_ALLOWED_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALLOWED")(x.asInstanceOf[js.Any])
    
    inline def FAILURE_STRING(num: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/noMagicNumbersRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
