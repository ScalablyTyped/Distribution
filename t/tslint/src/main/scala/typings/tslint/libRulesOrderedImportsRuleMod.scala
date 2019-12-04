package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/orderedImportsRule", JSImport.Namespace)
@js.native
object libRulesOrderedImportsRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var IMPORT_SOURCES_NOT_GROUPED_PREFIX: String = js.native
    var IMPORT_SOURCES_UNORDERED: String = js.native
    var NAMED_IMPORTS_UNORDERED: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

