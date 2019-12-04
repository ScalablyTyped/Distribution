package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/fileNameCasingRule", JSImport.Namespace)
@js.native
object libRulesFileNameCasingRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: js.Any = js.native
    var metadata: IRuleMetadata = js.native
    var stylizedNameForCasing: js.Any = js.native
    def showWarning(message: String): Unit = js.native
  }
  
}

