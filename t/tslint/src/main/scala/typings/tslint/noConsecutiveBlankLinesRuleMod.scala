package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TextRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noConsecutiveBlankLinesRuleMod {
  
  @JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", "Rule.DEFAULT_ALLOWED_BLANKS")
    @js.native
    def DEFAULT_ALLOWED_BLANKS: Double = js.native
    @scala.inline
    def DEFAULT_ALLOWED_BLANKS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALLOWED_BLANKS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", "Rule.FAILURE_STRING_FACTORY")
    @js.native
    def FAILURE_STRING_FACTORY(allowed: Double): String = js.native
    
    @JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", "getTemplateRanges")
  @js.native
  def getTemplateRanges(sourceFile: SourceFile): js.Array[TextRange] = js.native
}
