package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesArrowReturnShorthandRuleMod {
  
  @JSImport("tslint/lib/rules/arrowReturnShorthandRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/arrowReturnShorthandRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(isObjectLiteral: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(isObjectLiteral.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/arrowReturnShorthandRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
