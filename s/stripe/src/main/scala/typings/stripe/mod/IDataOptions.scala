package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataOptions extends js.Object {
  var expand: js.UndefOr[js.Array[String]] = js.native
  var include: js.UndefOr[js.Array[String]] = js.native
}

object IDataOptions {
  @scala.inline
  def apply(): IDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataOptions]
  }
  @scala.inline
  implicit class IDataOptionsOps[Self <: IDataOptions] (val x: Self) extends AnyVal {
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
    def setExpandVarargs(value: String*): Self = this.set("expand", js.Array(value :_*))
    @scala.inline
    def setExpand(value: js.Array[String]): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
  
}

