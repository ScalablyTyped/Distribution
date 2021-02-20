package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noDuplicateSuperRuleMod {
  
  @JSImport("tslint/lib/rules/noDuplicateSuperRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noDuplicateSuperRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noDuplicateSuperRule", "Rule.FAILURE_STRING_DUPLICATE")
    @js.native
    def FAILURE_STRING_DUPLICATE: String = js.native
    @scala.inline
    def FAILURE_STRING_DUPLICATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_DUPLICATE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noDuplicateSuperRule", "Rule.FAILURE_STRING_LOOP")
    @js.native
    def FAILURE_STRING_LOOP: String = js.native
    @scala.inline
    def FAILURE_STRING_LOOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_LOOP")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noDuplicateSuperRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
