package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitMarginOptions extends js.Object {
  var `first-column`: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String] = js.native
}

object UIkitMarginOptions {
  @scala.inline
  def apply(): UIkitMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitMarginOptions]
  }
  @scala.inline
  implicit class UIkitMarginOptionsOps[Self <: UIkitMarginOptions] (val x: Self) extends AnyVal {
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
    def `setFirst-column`(value: String): Self = this.set("first-column", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFirst-column`: Self = this.set("first-column", js.undefined)
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
  
}

