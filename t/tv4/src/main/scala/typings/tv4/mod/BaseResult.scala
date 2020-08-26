package typings.tv4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseResult extends js.Object {
  var missing: js.Array[String] = js.native
  var valid: Boolean = js.native
}

object BaseResult {
  @scala.inline
  def apply(missing: js.Array[String], valid: Boolean): BaseResult = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResult]
  }
  @scala.inline
  implicit class BaseResultOps[Self <: BaseResult] (val x: Self) extends AnyVal {
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
    def setMissingVarargs(value: String*): Self = this.set("missing", js.Array(value :_*))
    @scala.inline
    def setMissing(value: js.Array[String]): Self = this.set("missing", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

