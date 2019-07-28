package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Size
import typings.winrt.WindowsNs.UINs.PopupsNs.IUICommand
import typings.winrt.WindowsNs.UINs.PopupsNs.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowDialog extends js.Object {
  @JSName("backButtonCommand")
  var backButtonCommand_Original: UICommandInvokedHandler = js.native
  var cancelCommandIndex: Double = js.native
  var commands: IVector[IUICommand] = js.native
  var defaultCommandIndex: Double = js.native
  var isInteractionDelayed: Double = js.native
  var maxSize: Size = js.native
  var minSize: Size = js.native
  var onshowing: js.Any = js.native
  var title: String = js.native
  def backButtonCommand(command: IUICommand): Unit = js.native
  def showAsync(): IAsyncOperation[IUICommand] = js.native
}

