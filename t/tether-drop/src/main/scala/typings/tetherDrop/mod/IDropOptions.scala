package typings.tetherDrop.mod

import typings.std.Element
import typings.std.Event
import typings.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropOptions extends js.Object {
  var beforeClose: js.UndefOr[js.Function2[/* event */ Event, /* drop */ Drop, Boolean]] = js.native
  var blurDelay: js.UndefOr[Double] = js.native
  var classes: js.UndefOr[String] = js.native
  var closeDelay: js.UndefOr[Double] = js.native
  var constrainToScrollParent: js.UndefOr[Boolean] = js.native
  var constrainToWindow: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[Element | String | (js.Function1[js.UndefOr[Drop], Element | String])] = js.native
  var focusDelay: js.UndefOr[Double] = js.native
  var hoverCloseDelay: js.UndefOr[Double] = js.native
  var hoverOpenDelay: js.UndefOr[Double] = js.native
  var openDelay: js.UndefOr[Double] = js.native
  var openOn: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[Element] = js.native
  var tetherOptions: js.UndefOr[ITetherOptions] = js.native
}

object IDropOptions {
  @scala.inline
  def apply(): IDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropOptions]
  }
  @scala.inline
  implicit class IDropOptionsOps[Self <: IDropOptions] (val x: Self) extends AnyVal {
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
    def setBeforeClose(value: (/* event */ Event, /* drop */ Drop) => Boolean): Self = this.set("beforeClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setBlurDelay(value: Double): Self = this.set("blurDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurDelay: Self = this.set("blurDelay", js.undefined)
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCloseDelay(value: Double): Self = this.set("closeDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseDelay: Self = this.set("closeDelay", js.undefined)
    @scala.inline
    def setConstrainToScrollParent(value: Boolean): Self = this.set("constrainToScrollParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainToScrollParent: Self = this.set("constrainToScrollParent", js.undefined)
    @scala.inline
    def setConstrainToWindow(value: Boolean): Self = this.set("constrainToWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainToWindow: Self = this.set("constrainToWindow", js.undefined)
    @scala.inline
    def setContentFunction1(value: js.UndefOr[Drop] => Element | String): Self = this.set("content", js.Any.fromFunction1(value))
    @scala.inline
    def setContent(value: Element | String | (js.Function1[js.UndefOr[Drop], Element | String])): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFocusDelay(value: Double): Self = this.set("focusDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusDelay: Self = this.set("focusDelay", js.undefined)
    @scala.inline
    def setHoverCloseDelay(value: Double): Self = this.set("hoverCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverCloseDelay: Self = this.set("hoverCloseDelay", js.undefined)
    @scala.inline
    def setHoverOpenDelay(value: Double): Self = this.set("hoverOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverOpenDelay: Self = this.set("hoverOpenDelay", js.undefined)
    @scala.inline
    def setOpenDelay(value: Double): Self = this.set("openDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenDelay: Self = this.set("openDelay", js.undefined)
    @scala.inline
    def setOpenOn(value: String): Self = this.set("openOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOn: Self = this.set("openOn", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTetherOptions(value: ITetherOptions): Self = this.set("tetherOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTetherOptions: Self = this.set("tetherOptions", js.undefined)
  }
  
}

