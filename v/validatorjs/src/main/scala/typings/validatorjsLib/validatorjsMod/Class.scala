package typings
package validatorjsLib.validatorjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validatorjs", JSImport.Namespace)
@js.native
class Class[A] protected () extends Validator[A] {
  def this(data: A, rules: Rules) = this()
  def this(data: A, rules: Rules, customMessages: ErrorMessages) = this()
}

