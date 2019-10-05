package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules", JSImport.Namespace)
@js.native
object libRulesMod extends js.Object {
  @js.native
  abstract class AbstractRule protected ()
    extends typings.tslint.libLanguageRuleAbstractRuleMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends typings.tslint.libLanguageRuleOptionallyTypedRuleMod.OptionallyTypedRule
  
  @js.native
  abstract class TypedRule ()
    extends typings.tslint.libLanguageRuleTypedRuleMod.TypedRule
  
  /* static members */
  @js.native
  object AbstractRule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
}

