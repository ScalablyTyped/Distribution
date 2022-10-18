package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesInterfaceNameRuleMod {
  
  @JSImport("tslint/lib/rules/interfaceNameRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/interfaceNameRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/interfaceNameRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    inline def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/interfaceNameRule", "Rule.FAILURE_STRING_NO_PREFIX")
    @js.native
    def FAILURE_STRING_NO_PREFIX: String = js.native
    inline def FAILURE_STRING_NO_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_NO_PREFIX")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/interfaceNameRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
