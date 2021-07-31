package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preferConditionalExpressionRuleMod {
  
  @JSImport("tslint/lib/rules/preferConditionalExpressionRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/preferConditionalExpressionRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def FAILURE_STRING(assigned: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(assigned.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/preferConditionalExpressionRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
