package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesNoMergeableNamespaceRuleMod {
  
  @JSImport("tslint/lib/rules/noMergeableNamespaceRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noMergeableNamespaceRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def failureStringFactory(name: String, seenBeforeLine: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("failureStringFactory")(name.asInstanceOf[js.Any], seenBeforeLine.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/noMergeableNamespaceRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
