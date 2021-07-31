package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.tslintNumbers.`-1`
import typings.tslint.tslintNumbers.`0`
import typings.tslint.tslintNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberOrderingRuleMod {
  
  @JSImport("tslint/lib/rules/memberOrderingRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def FAILURE_STRING_ALPHABETIZE(prevName: String, curName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_ALPHABETIZE")(prevName.asInstanceOf[js.Any], curName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def stringCompare(a: String, b: String): `1` | `-1` | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("stringCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `-1` | `0`]
  }
}
