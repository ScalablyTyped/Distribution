package typings.webidl2js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  var get: String = js.native
  var set: String = js.native
}

object Get {
  @scala.inline
  def apply(get: String, set: String): Get = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
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
    def setGet(value: String): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: String): Self = this.set("set", value.asInstanceOf[js.Any])
  }
  
}

