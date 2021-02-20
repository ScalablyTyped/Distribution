package typings.tslint

import typings.tslint.mod.Rules.OptionallyTypedRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectLiteralSortKeysRuleMod {
  
  @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule")
  @js.native
  class Rule protected () extends OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule.FAILURE_STRING_ALPHABETICAL")
    @js.native
    def FAILURE_STRING_ALPHABETICAL(name: String): String = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule.FAILURE_STRING_SHORTHAND_FIRST")
    @js.native
    def FAILURE_STRING_SHORTHAND_FIRST(name: String): String = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule.FAILURE_STRING_USE_DECLARATION_ORDER")
    @js.native
    def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String): String = js.native
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule.FAILURE_STRING_USE_DECLARATION_ORDER")
    @js.native
    def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String, typeName: String): String = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralSortKeysRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
