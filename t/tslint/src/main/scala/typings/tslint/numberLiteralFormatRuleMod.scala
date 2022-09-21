package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberLiteralFormatRuleMod {
  
  @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule.FAILURE_STRING_LEADING_0")
    @js.native
    def FAILURE_STRING_LEADING_0: String = js.native
    inline def FAILURE_STRING_LEADING_0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_LEADING_0")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule.FAILURE_STRING_LEADING_DECIMAL")
    @js.native
    def FAILURE_STRING_LEADING_DECIMAL: String = js.native
    inline def FAILURE_STRING_LEADING_DECIMAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_LEADING_DECIMAL")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule.FAILURE_STRING_NOT_UPPERCASE")
    @js.native
    def FAILURE_STRING_NOT_UPPERCASE: String = js.native
    inline def FAILURE_STRING_NOT_UPPERCASE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_NOT_UPPERCASE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule.FAILURE_STRING_TRAILING_0")
    @js.native
    def FAILURE_STRING_TRAILING_0: String = js.native
    inline def FAILURE_STRING_TRAILING_0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_TRAILING_0")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule.FAILURE_STRING_TRAILING_DECIMAL")
    @js.native
    def FAILURE_STRING_TRAILING_DECIMAL: String = js.native
    inline def FAILURE_STRING_TRAILING_DECIMAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_TRAILING_DECIMAL")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/numberLiteralFormatRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
