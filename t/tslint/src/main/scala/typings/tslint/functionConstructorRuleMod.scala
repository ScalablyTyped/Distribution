package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionConstructorRuleMod {
  
  @JSImport("tslint/lib/rules/functionConstructorRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/functionConstructorRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/functionConstructorRule", "Rule.FAILURE")
    @js.native
    def FAILURE: String = js.native
    @scala.inline
    def FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/functionConstructorRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
