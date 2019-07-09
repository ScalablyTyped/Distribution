package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable[T /* <: js.Function */] extends js.Object {
  var configurable: scala.Boolean
  def get(): T
}

object Anon_Configurable {
  @scala.inline
  def apply[T /* <: js.Function */](configurable: scala.Boolean, get: () => T): Anon_Configurable[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable, get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[Anon_Configurable[T]]
  }
}

