package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitScrollspyNavOptions extends js.Object {
  var closest: js.UndefOr[String] = js.native
  var cls: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
  var overflow: js.UndefOr[Boolean] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
}

object UIkitScrollspyNavOptions {
  @scala.inline
  def apply(): UIkitScrollspyNavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollspyNavOptions]
  }
  @scala.inline
  implicit class UIkitScrollspyNavOptionsOps[Self <: UIkitScrollspyNavOptions] (val x: Self) extends AnyVal {
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
    def setClosest(value: String): Self = this.set("closest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosest: Self = this.set("closest", js.undefined)
    @scala.inline
    def setCls(value: String): Self = this.set("cls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
  
}

