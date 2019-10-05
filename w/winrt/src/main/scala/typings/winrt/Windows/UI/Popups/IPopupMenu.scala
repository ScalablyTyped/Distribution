package typings.winrt.Windows.UI.Popups

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupMenu extends js.Object {
  var commands: IVector[IUICommand] = js.native
  def showAsync(invocationPoint: Point): IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: Rect): IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[IUICommand] = js.native
}

