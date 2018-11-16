package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Popups.MessageDialog")
@js.native
class MessageDialog protected () extends IMessageDialog {
  def this(content: java.lang.String) = this()
  def this(content: java.lang.String, title: java.lang.String) = this()
  /* CompleteClass */
  override var cancelCommandIndex: scala.Double = js.native
  /* CompleteClass */
  override var commands: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IUICommand] = js.native
  /* CompleteClass */
  override var content: java.lang.String = js.native
  /* CompleteClass */
  override var defaultCommandIndex: scala.Double = js.native
  /* CompleteClass */
  override var options: MessageDialogOptions = js.native
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /* CompleteClass */
  override def showAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IUICommand] = js.native
}

