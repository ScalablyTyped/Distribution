package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchAction extends js.Object {
  var action: ActionTypes = js.native
  var element: js.UndefOr[Element] = js.native
  var ms: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object TouchAction {
  @scala.inline
  def apply(action: ActionTypes): TouchAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
  @scala.inline
  implicit class TouchActionOps[Self <: TouchAction] (val x: Self) extends AnyVal {
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
    def setAction(value: ActionTypes): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

