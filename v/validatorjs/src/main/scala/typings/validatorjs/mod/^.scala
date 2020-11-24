package typings.validatorjs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validatorjs", JSImport.Namespace)
@js.native
class ^[A] protected () extends Validator[A] {
  def this(data: A, rules: Rules) = this()
  def this(data: A, rules: Rules, customMessages: ErrorMessages) = this()
}
@JSImport("validatorjs", JSImport.Namespace)
@js.native
object ^ extends TopLevel[ValidatorStatic]
