package typings.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable[T /* <: js.Function */] extends js.Object {
  var configurable: Boolean
  def get(): T
}

object Configurable {
  @scala.inline
  def apply[/* <: js.Function */ T](configurable: Boolean, get: () => T): Configurable[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable[T]]
  }
}

