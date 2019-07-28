package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers
import typings.winrt.WindowsNs.UINs.InputNs.PointerPoint
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
    val __obj = js.Dynamic.literal(currentPoint = currentPoint, getIntermediatePoints = js.Any.fromFunction0(getIntermediatePoints), handled = handled, keyModifiers = keyModifiers)
  
    __obj.asInstanceOf[IPointerEventArgs]
  }
}

