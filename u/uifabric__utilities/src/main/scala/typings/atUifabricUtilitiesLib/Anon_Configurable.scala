package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable[T /* <: js.Function */] extends js.Object {
  var configurable: scala.Boolean
  def get(): T
  def set(newValue: js.Any): scala.Unit
}

object Anon_Configurable {
  @scala.inline
  def apply[T /* <: js.Function */](configurable: scala.Boolean, get: js.Function0[T], set: js.Function1[js.Any, scala.Unit]): Anon_Configurable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configurable")(configurable)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Configurable[T]]
  }
}

