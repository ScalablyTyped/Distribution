package typings.tslint

import typings.tslint.abstractRuleMod.AbstractRule
import typings.tslint.ruleMod.ITypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/optionallyTypedRule", JSImport.Namespace)
@js.native
object optionallyTypedRuleMod extends js.Object {
  @js.native
  abstract class OptionallyTypedRule ()
    extends AbstractRule
       with ITypedRule
  
}

