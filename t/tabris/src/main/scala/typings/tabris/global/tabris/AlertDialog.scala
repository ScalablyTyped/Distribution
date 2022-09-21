package typings.tabris.global.tabris

import typings.tabris.anon.OmitAlertDialogtextInputsCheckDisposed
import typings.tabris.anon.OmitOmitAlertDialogtextInCid
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.AlertDialog")
@js.native
/**
  * An `AlertDialog` represents a native dialog pop-up showing a message and up to three buttons.  Is
  * automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class AlertDialog ()
  extends typings.tabris.mod.AlertDialog {
  def this(properties: Properties[OmitAlertDialogtextInputsCheckDisposed, OmitOmitAlertDialogtextInCid]) = this()
}
/* static members */
object AlertDialog {
  
  @JSGlobal("tabris.AlertDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given alert dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual AlertDialog.
    * @param alertDialog The alert dialog to open
    */
  inline def open(alertDialog: typings.tabris.mod.AlertDialog): typings.tabris.mod.AlertDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(alertDialog.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.AlertDialog]
  /**
    * Creates and opens an alert dialog with one 'OK' button and the given message.
    * @param message The message to display
    */
  inline def open(message: String): typings.tabris.mod.AlertDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(message.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.AlertDialog]
}
