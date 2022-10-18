package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoRedundantJsdocRuleMod {
  
  @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING_NO_COMMENT(tagName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_NO_COMMENT")(tagName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAILURE_STRING_REDUNDANT_TAG(tagName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_REDUNDANT_TAG")(tagName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule.FAILURE_STRING_REDUNDANT_TYPE")
    @js.native
    def FAILURE_STRING_REDUNDANT_TYPE: String = js.native
    inline def FAILURE_STRING_REDUNDANT_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_REDUNDANT_TYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
