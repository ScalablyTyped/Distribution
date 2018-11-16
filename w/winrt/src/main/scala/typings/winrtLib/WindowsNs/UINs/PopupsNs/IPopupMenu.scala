package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupMenu extends js.Object {
  var commands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand] = js.native
  def showAsync(invocationPoint: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: winrtLib.WindowsNs.FoundationNs.Rect): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: winrtLib.WindowsNs.FoundationNs.Rect, preferredPlacement: Placement): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand] = js.native
}

