package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invalidVoidRuleMod {
  
  @JSImport("tslint/lib/rules/invalidVoidRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    var getAllowGenerics: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.FAILURE_STRING_ALLOW_GENERICS")
    @js.native
    def FAILURE_STRING_ALLOW_GENERICS: String = js.native
    @scala.inline
    def FAILURE_STRING_ALLOW_GENERICS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ALLOW_GENERICS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.FAILURE_STRING_NO_GENERICS")
    @js.native
    def FAILURE_STRING_NO_GENERICS: String = js.native
    @scala.inline
    def FAILURE_STRING_NO_GENERICS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_NO_GENERICS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.FAILURE_WRONG_GENERIC")
    @js.native
    def FAILURE_WRONG_GENERIC(genericName: String): String = js.native
    
    @JSImport("tslint/lib/rules/invalidVoidRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
