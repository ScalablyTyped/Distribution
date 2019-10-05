package typings.tslint.tslintMod

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Rules")
@js.native
object Rules extends js.Object {
  @js.native
  abstract class AbstractRule protected ()
    extends typings.tslint.libRulesMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends typings.tslint.libRulesMod.OptionallyTypedRule
  
  @js.native
  abstract class TypedRule ()
    extends typings.tslint.libRulesMod.TypedRule
  
  /* static members */
  @js.native
  object AbstractRule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
}

