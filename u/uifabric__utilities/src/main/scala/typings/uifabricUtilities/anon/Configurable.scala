package typings.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable[T /* <: js.Function */] extends js.Object {
  var configurable: Boolean = js.native
  def get(): T = js.native
}

object Configurable {
  @scala.inline
  def apply[/* <: js.Function */ T](configurable: Boolean, get: () => T): Configurable[T] = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable[T]]
  }
  @scala.inline
  implicit class ConfigurableOps[Self <: Configurable[_], /* <: js.Function */ T] (val x: Self with Configurable[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
  }
  
}

