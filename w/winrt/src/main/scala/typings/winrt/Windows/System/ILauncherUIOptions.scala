package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILauncherUIOptions extends js.Object {
  var invocationPoint: Point = js.native
  var preferredPlacement: Placement = js.native
  var selectionRect: Rect = js.native
}

object ILauncherUIOptions {
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): ILauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILauncherUIOptions]
  }
  @scala.inline
  implicit class ILauncherUIOptionsOps[Self <: ILauncherUIOptions] (val x: Self) extends AnyVal {
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
    def setInvocationPoint(value: Point): Self = this.set("invocationPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredPlacement(value: Placement): Self = this.set("preferredPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionRect(value: Rect): Self = this.set("selectionRect", value.asInstanceOf[js.Any])
  }
  
}

