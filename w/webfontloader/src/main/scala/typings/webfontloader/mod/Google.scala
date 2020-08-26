package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Google extends js.Object {
  var api: js.UndefOr[String] = js.native
  var families: js.Array[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object Google {
  @scala.inline
  def apply(families: js.Array[String]): Google = {
    val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any])
    __obj.asInstanceOf[Google]
  }
  @scala.inline
  implicit class GoogleOps[Self <: Google] (val x: Self) extends AnyVal {
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
    def setFamiliesVarargs(value: String*): Self = this.set("families", js.Array(value :_*))
    @scala.inline
    def setFamilies(value: js.Array[String]): Self = this.set("families", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi(value: String): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

