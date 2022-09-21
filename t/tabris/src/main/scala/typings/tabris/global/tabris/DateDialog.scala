package typings.tabris.global.tabris

import typings.tabris.anon.OmitDateDialogsetCheckDisposed
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.DateDialog")
@js.native
/**
  * A `DateDialog` represents a native dialog pop-up allowing the user to pick a date. Properties can
  * only be set before open() is called. The dialog is automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class DateDialog ()
  extends typings.tabris.mod.DateDialog {
  def this(properties: Properties[typings.tabris.mod.DateDialog, OmitDateDialogsetCheckDisposed]) = this()
}
/* static members */
object DateDialog {
  
  @JSGlobal("tabris.DateDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and opens a date dialog.
    * @param date The date to be displayed in the dialog. The current date is used when no date is provided.
    */
  inline def open(): typings.tabris.mod.DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[typings.tabris.mod.DateDialog]
  /**
    * Makes the given date dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual DateDialog.
    * @param dateDialog The date dialog to open
    */
  inline def open(dateDialog: typings.tabris.mod.DateDialog): typings.tabris.mod.DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(dateDialog.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.DateDialog]
  inline def open(date: js.Date): typings.tabris.mod.DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(date.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.DateDialog]
}
