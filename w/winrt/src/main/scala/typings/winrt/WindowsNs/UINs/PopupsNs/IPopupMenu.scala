package typings.winrt.WindowsNs.UINs.PopupsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Point
import typings.winrt.WindowsNs.FoundationNs.Rect
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

