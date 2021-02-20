package typings.tslint

import typings.tslint.mod.Rules.TypedRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noInferredEmptyObjectTypeRuleMod {
  
  @JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", "Rule.EMPTY_INTERFACE_FUNCTION")
    @js.native
    def EMPTY_INTERFACE_FUNCTION: String = js.native
    @scala.inline
    def EMPTY_INTERFACE_FUNCTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_INTERFACE_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", "Rule.EMPTY_INTERFACE_INSTANCE")
    @js.native
    def EMPTY_INTERFACE_INSTANCE: String = js.native
    @scala.inline
    def EMPTY_INTERFACE_INSTANCE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_INTERFACE_INSTANCE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noInferredEmptyObjectTypeRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
