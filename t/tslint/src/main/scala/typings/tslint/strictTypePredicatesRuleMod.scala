package typings.tslint

import typings.tslint.mod.Rules.TypedRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.tslintStrings.`null`
import typings.tslint.tslintStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictTypePredicatesRuleMod {
  
  @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def FAILURE_STRICT_PREFER_STRICT_EQUALS_null(value: `null`, isPositive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRICT_PREFER_STRICT_EQUALS")(value.asInstanceOf[js.Any], isPositive.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def FAILURE_STRICT_PREFER_STRICT_EQUALS_undefined(value: undefined, isPositive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRICT_PREFER_STRICT_EQUALS")(value.asInstanceOf[js.Any], isPositive.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def FAILURE_STRING(value: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule.FAILURE_STRING_BAD_TYPEOF")
    @js.native
    def FAILURE_STRING_BAD_TYPEOF: String = js.native
    @scala.inline
    def FAILURE_STRING_BAD_TYPEOF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_BAD_TYPEOF")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/strictTypePredicatesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
