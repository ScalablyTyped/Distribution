package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowFlyout extends js.Object {
  @JSName("backButtonCommand")
  var backButtonCommand_Original: winrtLib.WindowsNs.UINs.PopupsNs.UICommandInvokedHandler = js.native
  var commands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.UINs.PopupsNs.IUICommand] = js.native
  var defaultCommandIndex: scala.Double = js.native
  var isInteractionDelayed: scala.Double = js.native
  var maxSize: winrtLib.WindowsNs.FoundationNs.Size = js.native
  var minSize: winrtLib.WindowsNs.FoundationNs.Size = js.native
  var onshowing: js.Any = js.native
  var title: java.lang.String = js.native
  def backButtonCommand(command: winrtLib.WindowsNs.UINs.PopupsNs.IUICommand): scala.Unit = js.native
  def showAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.UINs.PopupsNs.IUICommand] = js.native
}

