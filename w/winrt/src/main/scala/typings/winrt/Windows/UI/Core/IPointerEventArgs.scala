package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.System.VirtualKeyModifiers
import typings.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerEventArgs extends ICoreWindowEventArgs {
  var currentPoint: PointerPoint = js.native
  var keyModifiers: VirtualKeyModifiers = js.native
  def getIntermediatePoints(): IVector[PointerPoint] = js.native
}

object IPointerEventArgs {
  @scala.inline
  def apply(
    currentPoint: PointerPoint,
    getIntermediatePoints: () => IVector[PointerPoint],
    handled: Boolean,
    keyModifiers: VirtualKeyModifiers
  ): IPointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint.asInstanceOf[js.Any], getIntermediatePoints = js.Any.fromFunction0(getIntermediatePoints), handled = handled.asInstanceOf[js.Any], keyModifiers = keyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerEventArgs]
  }
  @scala.inline
  implicit class IPointerEventArgsOps[Self <: IPointerEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentPoint(value: PointerPoint): Self = this.set("currentPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetIntermediatePoints(value: () => IVector[PointerPoint]): Self = this.set("getIntermediatePoints", js.Any.fromFunction0(value))
    @scala.inline
    def setKeyModifiers(value: VirtualKeyModifiers): Self = this.set("keyModifiers", value.asInstanceOf[js.Any])
  }
  
}

