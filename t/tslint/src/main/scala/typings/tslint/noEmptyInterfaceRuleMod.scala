package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noEmptyInterfaceRuleMod {
  
  @JSImport("tslint/lib/rules/noEmptyInterfaceRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noEmptyInterfaceRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noEmptyInterfaceRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    @scala.inline
    def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noEmptyInterfaceRule", "Rule.FAILURE_STRING_FOR_EXTENDS")
    @js.native
    def FAILURE_STRING_FOR_EXTENDS: String = js.native
    @scala.inline
    def FAILURE_STRING_FOR_EXTENDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_FOR_EXTENDS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noEmptyInterfaceRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
