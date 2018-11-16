package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.PointerEventArgs")
@js.native
class PointerEventArgs () extends IPointerEventArgs {
  /* CompleteClass */
  override var currentPoint: winrtLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  /* CompleteClass */
  override var handled: scala.Boolean = js.native
  /* CompleteClass */
  override var keyModifiers: winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers = js.native
  /* CompleteClass */
  override def getIntermediatePoints(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.InputNs.PointerPoint] = js.native
}

