package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.System.VirtualKeyModifiers
import typings.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.PointerEventArgs")
@js.native
class PointerEventArgs ()
  extends typings.winrt.Windows.UI.Core.PointerEventArgs {
  /* CompleteClass */
  override var currentPoint: PointerPoint = js.native
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyModifiers: VirtualKeyModifiers = js.native
  /* CompleteClass */
  override def getIntermediatePoints(): IVector[PointerPoint] = js.native
}

