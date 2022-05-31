package typings.tabris.global.tabris

import typings.std.Date
import typings.tabris.anon.OmitTimeDialogsetCheckDisposed
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.TimeDialog")
@js.native
class TimeDialog ()
  extends typings.tabris.mod.TimeDialog {
  def this(properties: Properties[typings.tabris.mod.TimeDialog, OmitTimeDialogsetCheckDisposed]) = this()
}
/* static members */
object TimeDialog {
  
  @JSGlobal("tabris.TimeDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and opens a time dialog.
    * @param date The time to be displayed in the dialog. The current time is used when no date object is provided.
    */
  inline def open(): typings.tabris.mod.TimeDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[typings.tabris.mod.TimeDialog]
  inline def open(date: Date): typings.tabris.mod.TimeDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(date.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.TimeDialog]
  /**
    * Makes the given time dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual TimeDialog.
    * @param timeDialog The time dialog to open
    */
  inline def open(timeDialog: typings.tabris.mod.TimeDialog): typings.tabris.mod.TimeDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(timeDialog.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.TimeDialog]
}
