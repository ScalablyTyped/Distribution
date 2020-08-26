package typings.valiant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint[T] extends js.Object {
  var finite: Boolean = js.native
  var inclusive: Boolean = js.native
  var value: T = js.native
}

object Endpoint {
  @scala.inline
  def apply[T](finite: Boolean, inclusive: Boolean, value: T): Endpoint[T] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint[T]]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint[_], T] (val x: Self with Endpoint[T]) extends AnyVal {
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
    def setFinite(value: Boolean): Self = this.set("finite", value.asInstanceOf[js.Any])
    @scala.inline
    def setInclusive(value: Boolean): Self = this.set("inclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

