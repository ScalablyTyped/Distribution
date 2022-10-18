package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.TypedRule
import typings.tslint.tslintInts.`0`
import typings.tslint.tslintInts.`1`
import typings.tslint.tslintInts.`2`
import typings.tslint.tslintInts.`3`
import typings.tslint.tslintInts.`4`
import typings.tslint.tslintInts.`5`
import typings.tslint.tslintInts.`6`
import typings.tslint.tslintInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesStrictComparisonsRuleMod {
  
  @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
    
    /* private */ var getRuleOptions: Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def INVALID_TYPES(types1: js.Array[TypeKind], types2: js.Array[TypeKind]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_TYPES")(types1.asInstanceOf[js.Any], types2.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def INVALID_TYPE_FOR_OPERATOR(`type`: TypeKind, comparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_TYPE_FOR_OPERATOR")(`type`.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/strictComparisonsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.tslintInts.`0`
    - typings.tslint.tslintInts.`1`
    - typings.tslint.tslintInts.`2`
    - typings.tslint.tslintInts.`3`
    - typings.tslint.tslintInts.`4`
    - typings.tslint.tslintInts.`5`
    - typings.tslint.tslintInts.`6`
    - typings.tslint.tslintInts.`7`
  */
  trait TypeKind extends StObject
  object TypeKind {
    
    inline def Any: `0` = 0.asInstanceOf[`0`]
    
    inline def Boolean: `4` = 4.asInstanceOf[`4`]
    
    inline def Enum: `2` = 2.asInstanceOf[`2`]
    
    inline def Null: `5` = 5.asInstanceOf[`5`]
    
    inline def Number: `1` = 1.asInstanceOf[`1`]
    
    inline def Object: `7` = 7.asInstanceOf[`7`]
    
    inline def String: `3` = 3.asInstanceOf[`3`]
    
    inline def Undefined: `6` = 6.asInstanceOf[`6`]
  }
}
