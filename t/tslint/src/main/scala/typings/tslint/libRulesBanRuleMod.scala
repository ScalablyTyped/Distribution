package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesBanRuleMod {
  
  @JSImport("tslint/lib/rules/banRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/banRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING_FACTORY(expression: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_FACTORY")(expression.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def FAILURE_STRING_FACTORY(expression: String, messageAddition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_FACTORY")(expression.asInstanceOf[js.Any], messageAddition.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/banRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
