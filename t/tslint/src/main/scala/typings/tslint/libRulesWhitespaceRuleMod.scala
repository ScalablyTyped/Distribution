package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesWhitespaceRuleMod {
  
  @JSImport("tslint/lib/rules/whitespaceRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/whitespaceRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/whitespaceRule", "Rule.FAILURE_STRING_INVALID")
    @js.native
    def FAILURE_STRING_INVALID: String = js.native
    inline def FAILURE_STRING_INVALID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/whitespaceRule", "Rule.FAILURE_STRING_MISSING")
    @js.native
    def FAILURE_STRING_MISSING: String = js.native
    inline def FAILURE_STRING_MISSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/whitespaceRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
