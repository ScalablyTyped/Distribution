package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Components
@js.native
trait UIkitCountdownOptions extends js.Object {
  var date: js.UndefOr[String | Boolean] = js.native
}

object UIkitCountdownOptions {
  @scala.inline
  def apply(): UIkitCountdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitCountdownOptions]
  }
  @scala.inline
  implicit class UIkitCountdownOptionsOps[Self <: UIkitCountdownOptions] (val x: Self) extends AnyVal {
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
    def setDate(value: String | Boolean): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
  }
  
}

