package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.contentchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets and sets information from the clipboard object. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
@js.native
abstract class Clipboard () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
@js.native
object Clipboard extends js.Object {
  /** Occurs when the data stored in the Clipboard changes. */
  @JSName("oncontentchanged")
  var oncontentchanged_Original: EventHandler[_] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentchanged(`type`: contentchanged, listener: EventHandler[_]): Unit = js.native
  /** Removes all data from the Clipboard. */
  def clear(): Unit = js.native
  /** Adds the content to the Clipboard and releases the DataPackage object from the source app. This method allows the content to remain available after the application shuts down. */
  def flush(): Unit = js.native
  /**
    * Gets the current content that is stored in the clipboard object.
    * @return Contains the content of the Clipboard.
    */
  def getContent(): DataPackageView = js.native
  /** Occurs when the data stored in the Clipboard changes. */
  def oncontentchanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentchanged(`type`: contentchanged, listener: EventHandler[_]): Unit = js.native
  /**
    * Sets the current content that is stored in the clipboard object.
    * @param content Contains the content of the clipboard. If NULL, the clipboard is emptied.
    */
  def setContent(content: DataPackage): Unit = js.native
}

