package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.tslintStrings.after
import typings.tslint.tslintStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedefWhitespaceRuleMod {
  
  @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def FAILURE_STRING_after(option: String, location: after, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(option.asInstanceOf[js.Any], location.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def FAILURE_STRING_before(option: String, location: before, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING")(option.asInstanceOf[js.Any], location.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
