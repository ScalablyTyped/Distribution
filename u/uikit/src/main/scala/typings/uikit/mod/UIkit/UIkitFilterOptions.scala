package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitFilterOptions extends js.Object {
  var selActive: js.UndefOr[String | Boolean] = js.native
  var target: js.UndefOr[String] = js.native
}

object UIkitFilterOptions {
  @scala.inline
  def apply(): UIkitFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitFilterOptions]
  }
  @scala.inline
  implicit class UIkitFilterOptionsOps[Self <: UIkitFilterOptions] (val x: Self) extends AnyVal {
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
    def setSelActive(value: String | Boolean): Self = this.set("selActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelActive: Self = this.set("selActive", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

