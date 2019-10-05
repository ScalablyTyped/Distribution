package typings.validatorjs.validatorjsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validatorjs", JSImport.Namespace)
@js.native
class ^[A] protected () extends Validator[A] {
  def this(data: A, rules: Rules) = this()
  def this(data: A, rules: Rules, customMessages: ErrorMessages) = this()
}

@JSImport("validatorjs", JSImport.Namespace)
@js.native
object ^ extends TopLevel[ValidatorStatic]

