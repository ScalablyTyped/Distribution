package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.UI.Popups.IUICommand
import typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions
import typings.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for context menus and message dialogs. */
@JSGlobal("Windows.UI.Popups")
@js.native
object Popups extends js.Object {
  /** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
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
    /** Gets or sets the index of the command you want to use as the cancel command. This is the command that fires when users press the ESC key. */
    /* CompleteClass */
    override var cancelCommandIndex: Double = js.native
    /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
    /* CompleteClass */
    override var commands: IVector[IUICommand] = js.native
    /** Gets or sets the message to be displayed to the user. */
    /* CompleteClass */
    override var content: String = js.native
    /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
    /* CompleteClass */
    override var defaultCommandIndex: Double = js.native
    /** Gets or sets the options for a MessageDialog . */
    /* CompleteClass */
    override var options: MessageDialogOptions = js.native
    /** Gets or sets the title to display on the dialog, if any. */
    /* CompleteClass */
    override var title: String = js.native
    /**
      * Begins an asynchronous operation showing a dialog.
      * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
      */
    /* CompleteClass */
    override def showAsync(): IPromiseWithIAsyncOperation[IUICommand] = js.native
  }
  
  /** Represents a context menu. */
  @js.native
  /** Creates a new instance of the PopupMenu class. */
  class PopupMenu ()
    extends typings.winrtUwp.Windows.UI.Popups.PopupMenu
  
  /** Represents a command in a context menu. */
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
  @js.native
  /** Creates a new instance of the UICommandSeparator class. */
  class UICommandSeparator ()
    extends typings.winrtUwp.Windows.UI.Popups.UICommandSeparator
  
  /** Specifies less frequently used options for a MessageDialog . */
  @js.native
  object MessageDialogOptions extends js.Object {
    /* 1 */ val acceptUserInputAfterDelay: typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Popups.MessageDialogOptions with Double] = js.native
  }
  
  /** Specifies where the context menu should be positioned relative to the selection rectangle. */
  @js.native
  object Placement extends js.Object {
    /* 1 */ val above: typings.winrtUwp.Windows.UI.Popups.Placement.above with Double = js.native
    /* 2 */ val below: typings.winrtUwp.Windows.UI.Popups.Placement.below with Double = js.native
    /* 0 */ val default: typings.winrtUwp.Windows.UI.Popups.Placement.default with Double = js.native
    /* 3 */ val left: typings.winrtUwp.Windows.UI.Popups.Placement.left with Double = js.native
    /* 4 */ val right: typings.winrtUwp.Windows.UI.Popups.Placement.right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Popups.Placement with Double] = js.native
  }
  
}

