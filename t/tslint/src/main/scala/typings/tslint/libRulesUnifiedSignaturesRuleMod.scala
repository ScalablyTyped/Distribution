package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesUnifiedSignaturesRuleMod {
  
  @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING_OMITTING_REST_PARAMETER(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_OMITTING_REST_PARAMETER")().asInstanceOf[String]
    inline def FAILURE_STRING_OMITTING_REST_PARAMETER(otherLine: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_OMITTING_REST_PARAMETER")(otherLine.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_OMITTING_SINGLE_PARAMETER")().asInstanceOf[String]
    inline def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(otherLine: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_OMITTING_SINGLE_PARAMETER")(otherLine.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: Double, type1: String, type2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE")(otherLine.asInstanceOf[js.Any], type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: Unit, type1: String, type2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE")(otherLine.asInstanceOf[js.Any], type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_START")
    @js.native
    def FAILURE_STRING_START: Any = js.native
    inline def FAILURE_STRING_START_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_START")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
