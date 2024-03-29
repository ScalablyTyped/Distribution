package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.tslintInts.`-1`
import typings.tslint.tslintInts.`0`
import typings.tslint.tslintInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesMemberOrderingRuleMod {
  
  @JSImport("tslint/lib/rules/memberOrderingRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FAILURE_STRING_ALPHABETIZE(prevName: String, curName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAILURE_STRING_ALPHABETIZE")(prevName.asInstanceOf[js.Any], curName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    inline def stringCompare(a: String, b: String): `1` | `-1` | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("stringCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `-1` | `0`]
  }
}
