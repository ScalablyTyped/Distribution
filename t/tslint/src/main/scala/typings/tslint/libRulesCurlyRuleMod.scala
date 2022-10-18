package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCurlyRuleMod {
  
  @JSImport("tslint/lib/rules/curlyRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule.FAILURE_STRING_AS_NEEDED")
    @js.native
    def FAILURE_STRING_AS_NEEDED: String = js.native
    inline def FAILURE_STRING_AS_NEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_AS_NEEDED")(x.asInstanceOf[js.Any])
    
    inline def FAILURE_STRING_FACTORY(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_FACTORY")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/curlyRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
