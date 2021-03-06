package typings.tslint

import typings.tslint.libUtilsMod.Encoding
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingRuleMod {
  
  @JSImport("tslint/lib/rules/encodingRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/encodingRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/encodingRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING(actual: Encoding): String = js.native
    
    @JSImport("tslint/lib/rules/encodingRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
