package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerEventArgs extends ICoreWindowEventArgs {
  var currentPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint
  var keyModifiers: winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  def getIntermediatePoints(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.InputNs.PointerPoint]
}

object IPointerEventArgs {
  @scala.inline
  def apply(
    currentPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint,
    getIntermediatePoints: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.InputNs.PointerPoint],
    handled: scala.Boolean,
    keyModifiers: winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  ): IPointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint, getIntermediatePoints = js.Any.fromFunction0(getIntermediatePoints), handled = handled, keyModifiers = keyModifiers)
  
    __obj.asInstanceOf[IPointerEventArgs]
  }
}

