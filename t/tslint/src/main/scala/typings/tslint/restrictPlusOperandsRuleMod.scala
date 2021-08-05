package typings.tslint

import typings.tslint.mod.Rules.TypedRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restrictPlusOperandsRuleMod {
  
  @JSImport("tslint/lib/rules/restrictPlusOperandsRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/restrictPlusOperandsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/restrictPlusOperandsRule", "Rule.INVALID_TYPES_ERROR")
    @js.native
    def INVALID_TYPES_ERROR: String = js.native
    inline def INVALID_TYPES_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TYPES_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/restrictPlusOperandsRule", "Rule.SUGGEST_TEMPLATE_LITERALS")
    @js.native
    def SUGGEST_TEMPLATE_LITERALS: String = js.native
    inline def SUGGEST_TEMPLATE_LITERALS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUGGEST_TEMPLATE_LITERALS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/restrictPlusOperandsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
