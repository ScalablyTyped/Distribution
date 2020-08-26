package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEdgeGestureStatics extends js.Object {
  def getForCurrentView(): EdgeGesture = js.native
}

object IEdgeGestureStatics {
  @scala.inline
  def apply(getForCurrentView: () => EdgeGesture): IEdgeGestureStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IEdgeGestureStatics]
  }
  @scala.inline
  implicit class IEdgeGestureStaticsOps[Self <: IEdgeGestureStatics] (val x: Self) extends AnyVal {
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
    def setGetForCurrentView(value: () => EdgeGesture): Self = this.set("getForCurrentView", js.Any.fromFunction0(value))
  }
  
}

