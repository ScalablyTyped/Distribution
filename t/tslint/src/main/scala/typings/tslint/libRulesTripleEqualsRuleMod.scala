package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesTripleEqualsRuleMod {
  
  @JSImport("tslint/lib/rules/tripleEqualsRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/tripleEqualsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/tripleEqualsRule", "Rule.EQ_FAILURE_STRING")
    @js.native
    def EQ_FAILURE_STRING: String = js.native
    inline def EQ_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQ_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/tripleEqualsRule", "Rule.NEQ_FAILURE_STRING")
    @js.native
    def NEQ_FAILURE_STRING: String = js.native
    inline def NEQ_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEQ_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/tripleEqualsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
