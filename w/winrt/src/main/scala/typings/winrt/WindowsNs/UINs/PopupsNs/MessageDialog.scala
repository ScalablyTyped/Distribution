package typings.winrt.WindowsNs.UINs.PopupsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Popups.MessageDialog")
@js.native
class MessageDialog protected () extends IMessageDialog {
  def this(content: String) = this()
  def this(content: String, title: String) = this()
  /* CompleteClass */
  override var cancelCommandIndex: Double = js.native
  /* CompleteClass */
  override var commands: IVector[IUICommand] = js.native
  /* CompleteClass */
  override var content: String = js.native
  /* CompleteClass */
  override var defaultCommandIndex: Double = js.native
  /* CompleteClass */
  override var options: MessageDialogOptions = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override def showAsync(): IAsyncOperation[IUICommand] = js.native
}

