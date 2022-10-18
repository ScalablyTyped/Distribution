package typings.tabris.mod

import typings.tabris.anon.OmitTimeDialogset
import typings.tabris.anon.`3`
import typings.tabris.tabrisStrings.date
import typings.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "TimeDialog")
@js.native
/**
  * A `TimeDialog` represents a native dialog pop-up allowing the user to pick a time of day. Properties
  * can only be set before open() is called. The dialog is automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class TimeDialog () extends Popup {
  def this(properties: Properties[TimeDialog, OmitTimeDialogset]) = this()
  
  /**
    * The time to be displayed in the dialog. The current time is used when no date object is provided.
    */
  var date: js.Date = js.native
  
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_TimeDialog: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & `3` = js.native
  
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
object TimeDialog {
  
  @JSImport("tabris", "TimeDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and opens a time dialog.
    * @param date The time to be displayed in the dialog. The current time is used when no date object is provided.
    */
  inline def open(): TimeDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[TimeDialog]
  inline def open(date: js.Date): TimeDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(date.asInstanceOf[js.Any]).asInstanceOf[TimeDialog]
  /**
    * Makes the given time dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual TimeDialog.
    * @param timeDialog The time dialog to open
    */
  inline def open(timeDialog: TimeDialog): TimeDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(timeDialog.asInstanceOf[js.Any]).asInstanceOf[TimeDialog]
}
