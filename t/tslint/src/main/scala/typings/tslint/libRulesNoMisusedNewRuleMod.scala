package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoMisusedNewRuleMod {
  
  @JSImport("tslint/lib/rules/noMisusedNewRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noMisusedNewRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noMisusedNewRule", "Rule.FAILURE_STRING_CLASS")
    @js.native
    def FAILURE_STRING_CLASS: String = js.native
    inline def FAILURE_STRING_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noMisusedNewRule", "Rule.FAILURE_STRING_INTERFACE")
    @js.native
    def FAILURE_STRING_INTERFACE: String = js.native
    inline def FAILURE_STRING_INTERFACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_INTERFACE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noMisusedNewRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
