package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  var as: js.Array[String] = js.native
  var cross: js.UndefOr[Boolean] = js.native
  var fields: js.Array[String] = js.native
  var ops: js.Array[String] = js.native
}

object As {
  @scala.inline
  def apply(as: js.Array[String], fields: js.Array[String], ops: js.Array[String]): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
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
    def setAsVarargs(value: String*): Self = this.set("as", js.Array(value :_*))
    @scala.inline
    def setAs(value: js.Array[String]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpsVarargs(value: String*): Self = this.set("ops", js.Array(value :_*))
    @scala.inline
    def setOps(value: js.Array[String]): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def setCross(value: Boolean): Self = this.set("cross", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCross: Self = this.set("cross", js.undefined)
  }
  
}

