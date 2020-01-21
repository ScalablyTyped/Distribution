package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `ModalDialog` displays over the video and its controls, which blocks
  * interaction with the player until it is closed.
  *
  * Modal dialogs include a "Close" button and will close when that button
  * is activated - or when ESC is pressed anywhere.
  */
@js.native
trait ModalDialog extends Component {
  var closeable_ : Boolean = js.native
  @JSName("options_")
  var options__ModalDialog: ModalDialogOptions = js.native
  /**
    * Closes the modal, does nothing if the `ModalDialog` is
    * not open.
    *
    * @fires ModalDialog#beforemodalclose
    * @fires ModalDialog#modalclose
    */
  def close(): Unit = js.native
  /**
    * Check to see if the `ModalDialog` is closeable via the UI.
    *
    * @param [value]
    *         If given as a boolean, it will set the `closeable` option.
    *
    * @return Returns the final value of the closable option.
    */
  def closeable(value: Boolean): Boolean = js.native
  /**
    * Gets or sets the modal content, which gets normalized before being
    * rendered into the DOM.
    *
    * This does not update the DOM or fill the modal, but it is called during
    * that process.
    *
    * @param [value]
    *         If defined, sets the internal content value to be used on the
    *         next call(s) to `fill`. This value is normalized before being
    *         inserted. To "clear" the internal content value, pass `null`.
    *
    * @return The current content of the modal dialog
    */
  def content(): js.Any = js.native
  def content(value: Content): js.Any = js.native
  /**
    * Returns the description string for this modal. Primarily used for
    * accessibility.
    *
    * @return The localized or raw description of this modal.
    */
  def description(): String = js.native
  /**
    * Empties the content element. This happens anytime the modal is filled.
    *
    * @fires ModalDialog#beforemodalempty
    * @fires ModalDialog#modalempty
    */
  def empty(): Unit = js.native
  /**
    * Fill the modal's content element with the modal's "content" option.
    * The content element will be emptied before this change takes place.
    */
  def fill(): Unit = js.native
  /**
    * Fill the modal's content element with arbitrary content.
    * The content element will be emptied before this change takes place.
    *
    * @fires ModalDialog#beforemodalfill
    * @fires ModalDialog#modalfill
    *
    * @param [content]
    *        The same rules apply to this as apply to the `content` option.
    */
  def fillWith(): Unit = js.native
  def fillWith(content: Content): Unit = js.native
  /**
    * Keydown handler. Attached when modal is focused.
    *
    * @listens keydown
    */
  def handleKeyDown(): Unit = js.native
  /**
    * Handles `keydown` events on the document, looking for ESC, which closes
    * the modal.
    *
    * @param e
    *        The keypress that triggered this event.
    *
    * @listens keydown
    */
  def handleKeyPress(e: Event): Unit = js.native
  /**
    * Returns the label string for this modal. Primarily used for accessibility.
    *
    * @return the localized or raw label of this modal.
    */
  def label(): String = js.native
  /**
    * Opens the modal.
    *
    * @fires ModalDialog#beforemodalopen
    * @fires ModalDialog#modalopen
    */
  def open(): Unit = js.native
  /**
    * If the `ModalDialog` is currently open or closed.
    *
    * @param [value]
    *         If given, it will open (`true`) or close (`false`) the modal.
    *
    * @return the current open state of the modaldialog
    */
  def opened(): Boolean = js.native
  def opened(value: Boolean): Boolean = js.native
}

