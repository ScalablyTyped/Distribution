package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noThisAssignmentRuleMod {
  
  @JSImport("tslint/lib/rules/noThisAssignmentRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noThisAssignmentRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noThisAssignmentRule", "Rule.FAILURE_STRING_BINDINGS")
    @js.native
    def FAILURE_STRING_BINDINGS: String = js.native
    @scala.inline
    def FAILURE_STRING_BINDINGS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_BINDINGS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noThisAssignmentRule", "Rule.FAILURE_STRING_FACTORY_IDENTIFIERS")
    @js.native
    def FAILURE_STRING_FACTORY_IDENTIFIERS(name: String): String = js.native
    
    @JSImport("tslint/lib/rules/noThisAssignmentRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
