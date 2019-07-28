package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers
import typings.winrt.WindowsNs.UINs.InputNs.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.PointerEventArgs")
@js.native
class PointerEventArgs () extends IPointerEventArgs {
  /* CompleteClass */
  override var currentPoint: PointerPoint = js.native
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyModifiers: VirtualKeyModifiers = js.native
  /* CompleteClass */
  override def getIntermediatePoints(): IVector[PointerPoint] = js.native
}

