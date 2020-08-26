package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle[T] extends js.Object {
  var bundle: js.Array[T] = js.native
}

object Bundle {
  @scala.inline
  def apply[T](bundle: js.Array[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle[_], T] (val x: Self with Bundle[T]) extends AnyVal {
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
    def setBundleVarargs(value: T*): Self = this.set("bundle", js.Array(value :_*))
    @scala.inline
    def setBundle(value: js.Array[T]): Self = this.set("bundle", value.asInstanceOf[js.Any])
  }
  
}

