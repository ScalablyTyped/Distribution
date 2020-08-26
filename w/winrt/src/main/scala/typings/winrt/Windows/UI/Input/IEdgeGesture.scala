package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEdgeGesture extends js.Object {
  var oncanceled: js.Any = js.native
  var oncompleted: js.Any = js.native
  var onstarting: js.Any = js.native
}

object IEdgeGesture {
  @scala.inline
  def apply(oncanceled: js.Any, oncompleted: js.Any, onstarting: js.Any): IEdgeGesture = {
    val __obj = js.Dynamic.literal(oncanceled = oncanceled.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onstarting = onstarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGesture]
  }
  @scala.inline
  implicit class IEdgeGestureOps[Self <: IEdgeGesture] (val x: Self) extends AnyVal {
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
    def setOncanceled(value: js.Any): Self = this.set("oncanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncompleted(value: js.Any): Self = this.set("oncompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnstarting(value: js.Any): Self = this.set("onstarting", value.asInstanceOf[js.Any])
  }
  
}

