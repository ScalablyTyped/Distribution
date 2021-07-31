package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayTypeRuleMod {
  
  @JSImport("tslint/lib/rules/arrayTypeRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/arrayTypeRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/arrayTypeRule", "Rule.FAILURE_STRING_ARRAY")
    @js.native
    def FAILURE_STRING_ARRAY: String = js.native
    @scala.inline
    def FAILURE_STRING_ARRAY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ARRAY")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/arrayTypeRule", "Rule.FAILURE_STRING_ARRAY_SIMPLE")
    @js.native
    def FAILURE_STRING_ARRAY_SIMPLE: String = js.native
    @scala.inline
    def FAILURE_STRING_ARRAY_SIMPLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ARRAY_SIMPLE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/arrayTypeRule", "Rule.FAILURE_STRING_GENERIC")
    @js.native
    def FAILURE_STRING_GENERIC: String = js.native
    @scala.inline
    def FAILURE_STRING_GENERIC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_GENERIC")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/arrayTypeRule", "Rule.FAILURE_STRING_GENERIC_SIMPLE")
    @js.native
    def FAILURE_STRING_GENERIC_SIMPLE: String = js.native
    @scala.inline
    def FAILURE_STRING_GENERIC_SIMPLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_GENERIC_SIMPLE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/arrayTypeRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
