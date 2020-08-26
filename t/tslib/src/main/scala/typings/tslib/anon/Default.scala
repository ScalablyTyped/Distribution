package typings.tslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default[T] extends js.Object {
  var default: T = js.native
}

object Default {
  @scala.inline
  def apply[T](default: T): Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default[_], T] (val x: Self with Default[T]) extends AnyVal {
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
    def setDefault(value: T): Self = this.set("default", value.asInstanceOf[js.Any])
  }
  
}

