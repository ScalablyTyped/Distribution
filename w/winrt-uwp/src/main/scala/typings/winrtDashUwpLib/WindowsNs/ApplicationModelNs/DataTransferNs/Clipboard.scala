package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets and sets information from the clipboard object. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
@js.native
abstract class Clipboard () extends js.Object

/** Gets and sets information from the clipboard object. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
@js.native
object Clipboard extends js.Object {
  /** Occurs when the data stored in the Clipboard changes. */
  @JSName("oncontentchanged")
  var oncontentchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contentchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Removes all data from the Clipboard. */
  def clear(): scala.Unit = js.native
  /** Adds the content to the Clipboard and releases the DataPackage object from the source app. This method allows the content to remain available after the application shuts down. */
  def flush(): scala.Unit = js.native
  /**
    * Gets the current content that is stored in the clipboard object.
    * @return Contains the content of the Clipboard.
    */
  def getContent(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageView = js.native
  /** Occurs when the data stored in the Clipboard changes. */
  def oncontentchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contentchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
    * Sets the current content that is stored in the clipboard object.
    * @param content Contains the content of the clipboard. If NULL, the clipboard is emptied.
    */
  def setContent(content: winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackage): scala.Unit = js.native
}

