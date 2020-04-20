package typings.tabris.mod

import typings.std.Date
import typings.tabris.OmitTimeDialogset
import typings.tabris.tabrisStrings.date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "TimeDialog")
@js.native
class TimeDialog () extends Popup {
  def this(properties: Properties[TimeDialog, OmitTimeDialogset]) = this()
  /**
    * The time to be displayed in the dialog. The current time is used when no date object is provided.
    */
  var date: Date = js.native
  /**
    * Fired when the time dialog was closed.
    */
  var onClose: Listeners[TimeDialogCloseEvent[this.type]] = js.native
  /**
    * Fired when the [*date*](#date) property has changed.
    */
  var onDateChanged: ChangeListeners[this.type, date] = js.native
  /**
    * Fired when a time was selected by the user.
    */
  var onSelect: Listeners[TimeDialogSelectEvent[this.type]] = js.native
}

/* static members */
@JSImport("tabris", "TimeDialog")
@js.native
object TimeDialog extends js.Object {
  /**
    * Creates and opens a time dialog.
    * @param date The time to be displayed in the dialog. The current time is used when no date object is provided.
    */
  def open(): TimeDialog = js.native
  def open(date: Date): TimeDialog = js.native
  /**
    * Makes the given time dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual TimeDialog.
    * @param timeDialog The time dialog to open
    */
  def open(timeDialog: TimeDialog): TimeDialog = js.native
}

