package typings.tslint

import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules", JSImport.Namespace)
@js.native
object rulesMod extends js.Object {
  @js.native
  abstract class AbstractRule protected ()
    extends typings.tslint.abstractRuleMod.AbstractRule {
    def this(options: IOptions) = this()
  }
  
  @js.native
  abstract class OptionallyTypedRule ()
    extends typings.tslint.optionallyTypedRuleMod.OptionallyTypedRule
  
  @js.native
  abstract class TypedRule ()
    extends typings.tslint.typedRuleMod.TypedRule
  
  /* static members */
  @js.native
  object AbstractRule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
}

