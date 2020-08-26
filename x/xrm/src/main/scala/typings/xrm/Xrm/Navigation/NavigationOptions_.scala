package typings.xrm.Xrm.Navigation

import typings.xrm.Xrm.Navigation.NavigationOptions.SizeValue
import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for navigating to a page: whether to open inline or in a dialog. If you don't specify this parameter, page is opened inline by default.
  * */
@js.native
trait NavigationOptions_ extends js.Object {
  /**
    * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
    * */
  var height: js.UndefOr[Double | SizeValue] = js.native
  /**
    * Specify 1 to open the dialog in center; 2 to open the dialog on the side. Default is 1 (center).
    * */
  var position: js.UndefOr[`1` | `2`] = js.native
  /**
    * Specify 1 to open the page inline; 2 to open the page in a dialog.
    * Entity lists can only be opened inline; web resources can be opened either inline or in a dialog.
    * */
  var target: `1` | `2` = js.native
  /**
    * The width of dialog. To specify the width in pixels, just type a numeric value. To specify the width in percentage, specify an object of type
    * */
  var width: js.UndefOr[Double | SizeValue] = js.native
}

object NavigationOptions_ {
  @scala.inline
  def apply(target: `1` | `2`): NavigationOptions_ = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions_]
  }
  @scala.inline
  implicit class NavigationOptions_Ops[Self <: NavigationOptions_] (val x: Self) extends AnyVal {
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
    def setTarget(value: `1` | `2`): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double | SizeValue): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPosition(value: `1` | `2`): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setWidth(value: Double | SizeValue): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

