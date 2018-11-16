package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", "Rules")
@js.native
object RulesNs extends js.Object {
  @js.native
  abstract class AbstractRule protected ()
    extends tslintLib.libRulesMod.AbstractRule {
    def this(options: tslintLib.libLanguageRuleRuleMod.IOptions) = this()
  }
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends tslintLib.libRulesMod.OptionallyTypedRule
  
  @js.native
  abstract class TypedRule ()
    extends tslintLib.libRulesMod.TypedRule
  
  @js.native
  object AbstractRule extends js.Object {
    var metadata: tslintLib.libLanguageRuleRuleMod.IRuleMetadata = js.native
  }
  
}

