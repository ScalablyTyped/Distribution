package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noDefaultImportRule", JSImport.Namespace)
@js.native
object libRulesNoDefaultImportRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getRuleOptions: js.Any = js.native
    var isFromModulesConfigOption: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
    def getNamedDefaultImport(namedBindings: NamedImports): Identifier | Null = js.native
  }
  
}

