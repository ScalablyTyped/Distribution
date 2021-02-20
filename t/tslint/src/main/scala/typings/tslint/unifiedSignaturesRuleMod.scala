package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unifiedSignaturesRuleMod {
  
  @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_OMITTING_REST_PARAMETER")
    @js.native
    def FAILURE_STRING_OMITTING_REST_PARAMETER(): String = js.native
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_OMITTING_REST_PARAMETER")
    @js.native
    def FAILURE_STRING_OMITTING_REST_PARAMETER(otherLine: Double): String = js.native
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_OMITTING_SINGLE_PARAMETER")
    @js.native
    def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(): String = js.native
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_OMITTING_SINGLE_PARAMETER")
    @js.native
    def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(otherLine: Double): String = js.native
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE")
    @js.native
    def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: js.UndefOr[scala.Nothing], type1: String, type2: String): String = js.native
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE")
    @js.native
    def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: Double, type1: String, type2: String): String = js.native
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.FAILURE_STRING_START")
    @js.native
    def FAILURE_STRING_START: js.Any = js.native
    @scala.inline
    def FAILURE_STRING_START_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_START")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/unifiedSignaturesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
