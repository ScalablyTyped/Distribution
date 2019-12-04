package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/importBlacklistRule", JSImport.Namespace)
@js.native
object libRulesImportBlacklistRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING_REGEX: String = js.native
    var IMPLICIT_NAMED_IMPORT_FAILURE_STRING: String = js.native
    var WHOLE_MODULE_FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
    def MAKE_NAMED_IMPORT_FAILURE_STRING(importName: String): String = js.native
  }
  
}

