package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.mod.Rules.AbstractRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCommentFormatRuleMod {
  
  @JSImport("tslint/lib/rules/commentFormatRule", "Rule")
  @js.native
  open class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def IGNORE_PATTERN_FAILURE_FACTORY(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IGNORE_PATTERN_FAILURE_FACTORY")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def IGNORE_WORDS_FAILURE_FACTORY(words: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IGNORE_WORDS_FAILURE_FACTORY")(words.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.LEADING_SPACE_FAILURE")
    @js.native
    def LEADING_SPACE_FAILURE: String = js.native
    inline def LEADING_SPACE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_SPACE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.LOWERCASE_FAILURE")
    @js.native
    def LOWERCASE_FAILURE: String = js.native
    inline def LOWERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOWERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.SPACE_LOWERCASE_FAILURE")
    @js.native
    def SPACE_LOWERCASE_FAILURE: String = js.native
    inline def SPACE_LOWERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_LOWERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.SPACE_UPPERCASE_FAILURE")
    @js.native
    def SPACE_UPPERCASE_FAILURE: String = js.native
    inline def SPACE_UPPERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_UPPERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.UPPERCASE_FAILURE")
    @js.native
    def UPPERCASE_FAILURE: String = js.native
    inline def UPPERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPPERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
