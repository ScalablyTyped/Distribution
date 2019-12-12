package typings.winrtDashUwp.Windows.UI

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Point
import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.UI.Popups.IUICommand
import typings.winrtDashUwp.Windows.UI.Popups.MessageDialogOptions
import typings.winrtDashUwp.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay
import typings.winrtDashUwp.Windows.UI.Popups.MessageDialogOptions.none
import typings.winrtDashUwp.Windows.UI.Popups.Placement
import typings.winrtDashUwp.Windows.UI.Popups.Placement.above
import typings.winrtDashUwp.Windows.UI.Popups.Placement.below
import typings.winrtDashUwp.Windows.UI.Popups.Placement.default
import typings.winrtDashUwp.Windows.UI.Popups.Placement.left
import typings.winrtDashUwp.Windows.UI.Popups.Placement.right
import typings.winrtDashUwp.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for context menus and message dialogs. */
@JSGlobal("Windows.UI.Popups")
@js.native
object Popups extends js.Object {
  /** Represents a command in a context menu or message dialog box. */
  @js.native
  trait IUICommand extends js.Object {
    /** Gets or sets the identifier of the command. */
    var id: js.Any = js.native
    /** Gets or sets the handler for the event that is fired when the user invokes the command. */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    /** Gets or sets the label for the command. */
    var label: String = js.native
    /** Gets or sets the handler for the event that is fired when the user invokes the command. */
    def invoked(command: IUICommand): Unit = js.native
  }
  
  /** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
  @js.native
  class MessageDialog protected () extends js.Object {
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
    var cancelCommandIndex: Double = js.native
    /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
    var commands: IVector[IUICommand] = js.native
    /** Gets or sets the message to be displayed to the user. */
    var content: String = js.native
    /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
    var defaultCommandIndex: Double = js.native
    /** Gets or sets the options for a MessageDialog . */
    var options: MessageDialogOptions = js.native
    /** Gets or sets the title to display on the dialog, if any. */
    var title: String = js.native
    /**
      * Begins an asynchronous operation showing a dialog.
      * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
      */
    def showAsync(): IPromiseWithIAsyncOperation[IUICommand] = js.native
  }
  
  @js.native
  sealed trait MessageDialogOptions extends js.Object
  
  @js.native
  sealed trait Placement extends js.Object
  
  /** Represents a context menu. */
  @js.native
  /** Creates a new instance of the PopupMenu class. */
  class PopupMenu () extends js.Object {
    /** Gets the commands for the context menu. */
    var commands: IVector[IUICommand] = js.native
    /**
      * Shows the context menu at the specified client coordinates.
      * @param invocationPoint The coordinates (in DIPs), relative to the window, of the user's finger or mouse pointer when the oncontextmenu event fired. The menu is placed above and centered on this point.
      * @return A IUICommand object that represents the context menu command that was invoked by the user, after the ShowAsync call completes.
      */
    def showAsync(invocationPoint: Point): IPromiseWithIAsyncOperation[IUICommand] = js.native
    /**
      * Shows the context menu above the specified selection.
      * @param selection The coordinates (in DIPs) of the selected rectangle, relative to the window. The context menu is placed directly above and centered on this rectangle such that selection is not covered.
      * @return A IUICommand object that represents the context menu command invoked by the user, after the ShowForSelectionAsync call completes.
      */
    def showForSelectionAsync(selection: Rect): IPromiseWithIAsyncOperation[IUICommand] = js.native
    /**
      * Shows the context menu in the preferred placement relative to the specified selection.
      * @param selection The coordinates (in DIPs) of the selected rectangle, relative to the window.
      * @param preferredPlacement The preferred placement of the context menu relative to the selection rectangle.
      * @return A IUICommand object that represents the context menu command invoked by the user, after the ShowForSelectionAsync call completes.
      */
    def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IPromiseWithIAsyncOperation[IUICommand] = js.native
  }
  
  /** Represents a command in a context menu. */
  @js.native
  /** Creates a new instance of the UICommand class. */
  class UICommand () extends js.Object {
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
    /** Gets or sets the identifier of the command. */
    var id: js.Any = js.native
    /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    /** Gets or sets the label for the command. */
    var label: String = js.native
    /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
    def invoked(command: IUICommand): Unit = js.native
  }
  
  /** Represents a command separator in a context menu. */
  @js.native
  /** Creates a new instance of the UICommandSeparator class. */
  class UICommandSeparator () extends js.Object {
    /** Gets or sets the identifier of the command separator. */
    var id: js.Any = js.native
    /** Gets or sets the handler for the event that is fired for the command separator. */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    /** Gets or sets the label for the command separator. */
    var label: String = js.native
    /** Gets or sets the handler for the event that is fired for the command separator. */
    def invoked(command: IUICommand): Unit = js.native
  }
  
  /** Specifies less frequently used options for a MessageDialog . */
  @js.native
  object MessageDialogOptions extends js.Object {
    /** Ignore user input for a short period. This enables browsers to defend against clickjacking. */
    @js.native
    sealed trait acceptUserInputAfterDelay extends MessageDialogOptions
    
    /** No options are specified and default behavior is used. */
    @js.native
    sealed trait none extends MessageDialogOptions
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageDialogOptions with Double] = js.native
    /* 1 */ @js.native
    object acceptUserInputAfterDelay extends TopLevel[acceptUserInputAfterDelay with Double]
    
    /* 0 */ @js.native
    object none extends TopLevel[none with Double]
    
  }
  
  /** Specifies where the context menu should be positioned relative to the selection rectangle. */
  @js.native
  object Placement extends js.Object {
    /** Place the context menu above the selection rectangle. */
    @js.native
    sealed trait above extends Placement
    
    /** Place the context menu below the selection rectangle. */
    @js.native
    sealed trait below extends Placement
    
    /** Place the context menu above the selection rectangle. */
    @js.native
    sealed trait default extends Placement
    
    /** Place the context menu to the left of the selection rectangle. */
    @js.native
    sealed trait left extends Placement
    
    /** Place the context menu to the right of the selection rectangle. */
    @js.native
    sealed trait right extends Placement
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Placement with Double] = js.native
    /* 1 */ @js.native
    object above extends TopLevel[above with Double]
    
    /* 2 */ @js.native
    object below extends TopLevel[below with Double]
    
    /* 0 */ @js.native
    object default extends TopLevel[default with Double]
    
    /* 3 */ @js.native
    object left extends TopLevel[left with Double]
    
    /* 4 */ @js.native
    object right extends TopLevel[right with Double]
    
  }
  
  /** Represents a callback function that handles the event that is fired when the user invokes a context menu command. */
  type UICommandInvokedHandler = js.Function1[/* command */ IUICommand, Unit]
}

