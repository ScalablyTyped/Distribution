package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesSpaceBeforeFunctionParenRuleMod {
  
  @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule.INVALID_WHITESPACE_ERROR")
    @js.native
    def INVALID_WHITESPACE_ERROR: String = js.native
    inline def INVALID_WHITESPACE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_WHITESPACE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule.MISSING_WHITESPACE_ERROR")
    @js.native
    def MISSING_WHITESPACE_ERROR: String = js.native
    inline def MISSING_WHITESPACE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_WHITESPACE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
