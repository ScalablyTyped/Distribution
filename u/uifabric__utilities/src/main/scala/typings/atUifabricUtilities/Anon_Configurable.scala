package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable[T /* <: js.Function */] extends js.Object {
  var configurable: Boolean
  def get(): T
}

object Anon_Configurable {
  @scala.inline
  def apply[T /* <: js.Function */](configurable: Boolean, get: () => T): Anon_Configurable[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[Anon_Configurable[T]]
  }
}

