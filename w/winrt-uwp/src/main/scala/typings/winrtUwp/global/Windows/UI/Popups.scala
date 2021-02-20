package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for context menus and message dialogs. */
object Popups {
  
  /** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
  @JSGlobal("Windows.UI.Popups.MessageDialog")
  @js.native
  class MessageDialog protected ()
    extends typings.winrtUwp.Windows.UI.Popups.MessageDialog {
    /**
      * Initializes a new instance of the MessageDialog class to display an untitled message dialog that can be used to ask your user simple questions.
      * @param content The message displayed to the user.
      */
    def this(content: String) = this()
    /**
      * Initializes a new instance of the MessageDialog class to display a titled message dialog that can be used to ask your user simple questions.
      * @param content The message displayed to the user.
      * @param title The title you want displayed on the dialog.
      */
    def this(content: String, title: String) = this()
  }
  
  /** Specifies less frequently used options for a MessageDialog . */
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions with Double] = js.native
    
    /* 1 */ val acceptUserInputAfterDelay: typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions.none with Double = js.native
  }
  
  /** Specifies where the context menu should be positioned relative to the selection rectangle. */
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Popups.Placement with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.Popups.Placement.default with Double = js.native
    
    /* 1 */ val above: typings.winrtUwp.Windows.UI.Popups.Placement.above with Double = js.native
    
    /* 2 */ val below: typings.winrtUwp.Windows.UI.Popups.Placement.below with Double = js.native
    
    /* 3 */ val left: typings.winrtUwp.Windows.UI.Popups.Placement.left with Double = js.native
    
    /* 4 */ val right: typings.winrtUwp.Windows.UI.Popups.Placement.right with Double = js.native
  }
  
  /** Represents a context menu. */
  @JSGlobal("Windows.UI.Popups.PopupMenu")
  @js.native
  /** Creates a new instance of the PopupMenu class. */
  class PopupMenu ()
    extends typings.winrtUwp.Windows.UI.Popups.PopupMenu
  
  /** Represents a command in a context menu. */
  @JSGlobal("Windows.UI.Popups.UICommand")
  @js.native
  /** Creates a new instance of the UICommand class. */
  class UICommand ()
    extends typings.winrtUwp.Windows.UI.Popups.UICommand {
    /**
      * Creates a new instance of the UICommand class using the specified label.
      * @param label The label for the UICommand .
      */
    def this(label: String) = this()
    /**
      * Creates a new instance of the UICommand class using the specified label and event handler.
      * @param label The label for the new command.
      * @param action The event handler for the new command.
      */
    def this(label: String, action: UICommandInvokedHandler) = this()
    /**
      * Creates a new instance of the UICommand class using the specified label, event handler, and command identifier.
      * @param label The label for the new command.
      * @param action The event handler for the new command.
      * @param commandId The command identifier for the new command.
      */
    def this(label: String, action: UICommandInvokedHandler, commandId: js.Any) = this()
  }
  
  /** Represents a command separator in a context menu. */
  @JSGlobal("Windows.UI.Popups.UICommandSeparator")
  @js.native
  /** Creates a new instance of the UICommandSeparator class. */
  class UICommandSeparator ()
    extends typings.winrtUwp.Windows.UI.Popups.UICommandSeparator
}
