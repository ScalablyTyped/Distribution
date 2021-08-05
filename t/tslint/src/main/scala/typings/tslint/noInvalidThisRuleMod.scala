package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noInvalidThisRuleMod {
  
  @JSImport("tslint/lib/rules/noInvalidThisRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noInvalidThisRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noInvalidThisRule", "Rule.FAILURE_STRING_INSIDE")
    @js.native
    def FAILURE_STRING_INSIDE: String = js.native
    inline def FAILURE_STRING_INSIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_INSIDE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noInvalidThisRule", "Rule.FAILURE_STRING_OUTSIDE")
    @js.native
    def FAILURE_STRING_OUTSIDE: String = js.native
    inline def FAILURE_STRING_OUTSIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_OUTSIDE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noInvalidThisRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
