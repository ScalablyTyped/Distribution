package typings.tslint

import typings.tslint.mod.Rules.TypedRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationRuleMod {
  
  @JSImport("tslint/lib/rules/deprecationRule", "Rule")
  @js.native
  class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/deprecationRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def FAILURE_STRING(name: String, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/deprecationRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
