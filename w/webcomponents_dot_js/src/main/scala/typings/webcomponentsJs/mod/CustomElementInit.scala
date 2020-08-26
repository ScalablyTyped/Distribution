package typings.webcomponentsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementInit extends js.Object {
  var `extends`: js.UndefOr[String] = js.native
}

object CustomElementInit {
  @scala.inline
  def apply(): CustomElementInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomElementInit]
  }
  @scala.inline
  implicit class CustomElementInitOps[Self <: CustomElementInit] (val x: Self) extends AnyVal {
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
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
  }
  
}

