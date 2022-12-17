package typings.tabris.mod

import typings.tabris.anon.Children
import typings.tabris.anon.OmitDateDialogset
import typings.tabris.tabrisStrings.date
import typings.tabris.tabrisStrings.maxDate
import typings.tabris.tabrisStrings.minDate
import typings.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "DateDialog")
@js.native
/**
  * A `DateDialog` represents a native dialog pop-up allowing the user to pick a date. Properties can
  * only be set before open() is called. The dialog is automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class DateDialog () extends Popup {
  def this(properties: Properties[DateDialog, OmitDateDialogset]) = this()
  
  /**
    * The date to be displayed in the dialog. The current date is used when no date is provided.
    */
  var date: js.Date = js.native
  
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_DateDialog: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
  
  /**
    * Limits the selectable date range to the given future date. No limit is applied when not set.
    */
  var maxDate: js.Date = js.native
  
  /**
    * Limits the selectable date range to the given past date. No limit is applied when not set.
    */
  var minDate: js.Date = js.native
  
  /**
    * Fired when the date dialog was closed.
    */
  var onClose: Listeners[DateDialogCloseEvent[this.type]] = js.native
  
  /**
    * Fired when the [*date*](#date) property has changed.
    */
  var onDateChanged: ChangeListeners[this.type, date] = js.native
  
  /**
    * Fired when the [*maxDate*](#maxDate) property has changed.
    */
  var onMaxDateChanged: ChangeListeners[this.type, maxDate] = js.native
  
  /**
    * Fired when the [*minDate*](#minDate) property has changed.
    */
  var onMinDateChanged: ChangeListeners[this.type, minDate] = js.native
  
  /**
    * Fired when a date was selected by the user.
    */
  var onSelect: Listeners[DateDialogSelectEvent[this.type]] = js.native
}
/* static members */
object DateDialog {
  
  @JSImport("tabris", "DateDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and opens a date dialog.
    * @param date The date to be displayed in the dialog. The current date is used when no date is provided.
    */
  inline def open(): DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[DateDialog]
  /**
    * Makes the given date dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual DateDialog.
    * @param dateDialog The date dialog to open
    */
  inline def open(dateDialog: DateDialog): DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(dateDialog.asInstanceOf[js.Any]).asInstanceOf[DateDialog]
  inline def open(date: js.Date): DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(date.asInstanceOf[js.Any]).asInstanceOf[DateDialog]
}
