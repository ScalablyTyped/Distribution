package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentFormatRuleMod {
  
  @JSImport("tslint/lib/rules/commentFormatRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.IGNORE_PATTERN_FAILURE_FACTORY")
    @js.native
    def IGNORE_PATTERN_FAILURE_FACTORY(pattern: String): String = js.native
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.IGNORE_WORDS_FAILURE_FACTORY")
    @js.native
    def IGNORE_WORDS_FAILURE_FACTORY(words: js.Array[String]): String = js.native
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.LEADING_SPACE_FAILURE")
    @js.native
    def LEADING_SPACE_FAILURE: String = js.native
    @scala.inline
    def LEADING_SPACE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_SPACE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.LOWERCASE_FAILURE")
    @js.native
    def LOWERCASE_FAILURE: String = js.native
    @scala.inline
    def LOWERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOWERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.SPACE_LOWERCASE_FAILURE")
    @js.native
    def SPACE_LOWERCASE_FAILURE: String = js.native
    @scala.inline
    def SPACE_LOWERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_LOWERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.SPACE_UPPERCASE_FAILURE")
    @js.native
    def SPACE_UPPERCASE_FAILURE: String = js.native
    @scala.inline
    def SPACE_UPPERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_UPPERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.UPPERCASE_FAILURE")
    @js.native
    def UPPERCASE_FAILURE: String = js.native
    @scala.inline
    def UPPERCASE_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPPERCASE_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/commentFormatRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
