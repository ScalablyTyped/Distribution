package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesMaxClassesPerFileRuleMod {
  
  @JSImport("tslint/lib/rules/maxClassesPerFileRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/maxClassesPerFileRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING(maxCount: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(maxCount.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/maxClassesPerFileRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
