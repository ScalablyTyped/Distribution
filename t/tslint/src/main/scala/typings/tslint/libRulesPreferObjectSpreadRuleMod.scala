package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesPreferObjectSpreadRuleMod {
  
  @JSImport("tslint/lib/rules/preferObjectSpreadRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/preferObjectSpreadRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/preferObjectSpreadRule", "Rule.ASSIGNMENT_FAILURE_STRING")
    @js.native
    def ASSIGNMENT_FAILURE_STRING: String = js.native
    inline def ASSIGNMENT_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ASSIGNMENT_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/preferObjectSpreadRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    inline def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/preferObjectSpreadRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
