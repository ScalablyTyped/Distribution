package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.System.VirtualKeyModifiers
import typings.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerEventArgs extends ICoreWindowEventArgs {
  var currentPoint: PointerPoint
  var keyModifiers: VirtualKeyModifiers
  def getIntermediatePoints(): IVector[PointerPoint]
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
}

