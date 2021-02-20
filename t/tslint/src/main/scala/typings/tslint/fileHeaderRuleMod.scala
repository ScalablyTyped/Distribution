package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileHeaderRuleMod {
  
  @JSImport("tslint/lib/rules/fileHeaderRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    var createComment: js.Any = js.native
    
    var doesNewLineEndingViolationExist: js.Any = js.native
    
    var generateLineEnding: js.Any = js.native
    
    var getFileHeaderText: js.Any = js.native
    
    var getRuleOptions: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/fileHeaderRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/fileHeaderRule", "Rule.MISSING_HEADER_FAILURE_STRING")
    @js.native
    def MISSING_HEADER_FAILURE_STRING: String = js.native
    @scala.inline
    def MISSING_HEADER_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_HEADER_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/fileHeaderRule", "Rule.MISSING_NEW_LINE_FAILURE_STRING")
    @js.native
    def MISSING_NEW_LINE_FAILURE_STRING: String = js.native
    @scala.inline
    def MISSING_NEW_LINE_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_NEW_LINE_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/fileHeaderRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
