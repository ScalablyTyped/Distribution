package typings.winrt.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popups {
  
  @js.native
  sealed trait MessageDialogOptions extends StObject
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @js.native
    sealed trait acceptUserInputAfterDelay
      extends StObject
         with MessageDialogOptions
    
    @js.native
    sealed trait none
      extends StObject
         with MessageDialogOptions
  }
  
  @js.native
  sealed trait Placement extends StObject
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @js.native
    sealed trait default
      extends StObject
         with Placement
    
    @js.native
    sealed trait above
      extends StObject
         with Placement
    
    @js.native
    sealed trait below
      extends StObject
         with Placement
    
    @js.native
    sealed trait left
      extends StObject
         with Placement
    
    @js.native
    sealed trait right
      extends StObject
         with Placement
  }
  
  trait IMessageDialog extends StObject {
    
    var cancelCommandIndex: Double
    
    var commands: IVector[IUICommand]
    
    var content: String
    
    var defaultCommandIndex: Double
    
    var options: MessageDialogOptions
    
    def showAsync(): IAsyncOperation[IUICommand]
    
    var title: String
  }
  object IMessageDialog {
    
    inline def apply(
      cancelCommandIndex: Double,
      commands: IVector[IUICommand],
      content: String,
      defaultCommandIndex: Double,
      options: MessageDialogOptions,
      showAsync: () => IAsyncOperation[IUICommand],
      title: String
    ): IMessageDialog = {
      val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageDialog]
    }
    
    extension [Self <: IMessageDialog](x: Self) {
      
      inline def setCancelCommandIndex(value: Double): Self = StObject.set(x, "cancelCommandIndex", value.asInstanceOf[js.Any])
      
      inline def setCommands(value: IVector[IUICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDefaultCommandIndex(value: Double): Self = StObject.set(x, "defaultCommandIndex", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MessageDialogOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setShowAsync(value: () => IAsyncOperation[IUICommand]): Self = StObject.set(x, "showAsync", js.Any.fromFunction0(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMessageDialogFactory extends StObject {
    
    def create(content: String): MessageDialog
    
    def createWithTitle(content: String, title: String): MessageDialog
  }
  object IMessageDialogFactory {
    
    inline def apply(create: String => MessageDialog, createWithTitle: (String, String) => MessageDialog): IMessageDialogFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
      __obj.asInstanceOf[IMessageDialogFactory]
    }
    
    extension [Self <: IMessageDialogFactory](x: Self) {
      
      inline def setCreate(value: String => MessageDialog): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateWithTitle(value: (String, String) => MessageDialog): Self = StObject.set(x, "createWithTitle", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IPopupMenu extends StObject {
    
    var commands: IVector[IUICommand] = js.native
    
    def showAsync(invocationPoint: Point): IAsyncOperation[IUICommand] = js.native
    
    def showForSelectionAsync(selection: Rect): IAsyncOperation[IUICommand] = js.native
    def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[IUICommand] = js.native
  }
  
  trait IUICommand extends StObject {
    
    var id: Any
    
    def invoked(command: IUICommand): Unit
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler
    
    var label: String
  }
  object IUICommand {
    
    inline def apply(id: Any, invoked: /* command */ IUICommand => Unit, label: String): IUICommand = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoked = js.Any.fromFunction1(invoked), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUICommand]
    }
    
    extension [Self <: IUICommand](x: Self) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInvoked(value: /* command */ IUICommand => Unit): Self = StObject.set(x, "invoked", js.Any.fromFunction1(value))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUICommandFactory extends StObject {
    
    def create(label: String): UICommand
    
    def createWithHandler(label: String, action: UICommandInvokedHandler): UICommand
    
    def createWithHandlerAndId(label: String, action: UICommandInvokedHandler, commandId: Any): UICommand
  }
  object IUICommandFactory {
    
    inline def apply(
      create: String => UICommand,
      createWithHandler: (String, UICommandInvokedHandler) => UICommand,
      createWithHandlerAndId: (String, UICommandInvokedHandler, Any) => UICommand
    ): IUICommandFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithHandler = js.Any.fromFunction2(createWithHandler), createWithHandlerAndId = js.Any.fromFunction3(createWithHandlerAndId))
      __obj.asInstanceOf[IUICommandFactory]
    }
    
    extension [Self <: IUICommandFactory](x: Self) {
      
      inline def setCreate(value: String => UICommand): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateWithHandler(value: (String, UICommandInvokedHandler) => UICommand): Self = StObject.set(x, "createWithHandler", js.Any.fromFunction2(value))
      
      inline def setCreateWithHandlerAndId(value: (String, UICommandInvokedHandler, Any) => UICommand): Self = StObject.set(x, "createWithHandlerAndId", js.Any.fromFunction3(value))
    }
  }
  
  trait MessageDialog
    extends StObject
       with IMessageDialog
  object MessageDialog {
    
    inline def apply(
      cancelCommandIndex: Double,
      commands: IVector[IUICommand],
      content: String,
      defaultCommandIndex: Double,
      options: MessageDialogOptions,
      showAsync: () => IAsyncOperation[IUICommand],
      title: String
    ): MessageDialog = {
      val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDialog]
    }
  }
  
  @js.native
  trait PopupMenu
    extends StObject
       with IPopupMenu
  
  trait UICommand
    extends StObject
       with IUICommand
  object UICommand {
    
    inline def apply(id: Any, invoked: /* command */ IUICommand => Unit, label: String): UICommand = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoked = js.Any.fromFunction1(invoked), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[UICommand]
    }
  }
  
  type UICommandInvokedHandler = js.Function1[/* command */ IUICommand, Unit]
  
  trait UICommandSeparator
    extends StObject
       with IUICommand
  object UICommandSeparator {
    
    inline def apply(id: Any, invoked: /* command */ IUICommand => Unit, label: String): UICommandSeparator = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoked = js.Any.fromFunction1(invoked), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[UICommandSeparator]
    }
  }
}
