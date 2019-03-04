package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigurableGet[T /* <: js.Function */] extends js.Object {
  var configurable: scala.Boolean
  def get(): T
}

object Anon_ConfigurableGet {
  @scala.inline
  def apply[T /* <: js.Function */](configurable: scala.Boolean, get: js.Function0[T]): Anon_ConfigurableGet[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable, get = get)
  
    __obj.asInstanceOf[Anon_ConfigurableGet[T]]
  }
}

