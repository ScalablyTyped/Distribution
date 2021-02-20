package typings.winrt.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popups {
  
  @js.native
  sealed trait MessageDialogOptions extends StObject
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @js.native
    sealed trait acceptUserInputAfterDelay extends MessageDialogOptions
    
    @js.native
    sealed trait none extends MessageDialogOptions
  }
  
  @js.native
  sealed trait Placement extends StObject
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @js.native
    sealed trait default extends Placement
    
    @js.native
    sealed trait above extends Placement
    
    @js.native
    sealed trait below extends Placement
    
    @js.native
    sealed trait left extends Placement
    
    @js.native
    sealed trait right extends Placement
  }
  
  @js.native
  trait IMessageDialog extends StObject {
    
    var cancelCommandIndex: Double = js.native
    
    var commands: IVector[IUICommand] = js.native
    
    var content: String = js.native
    
    var defaultCommandIndex: Double = js.native
    
    var options: MessageDialogOptions = js.native
    
    def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    var title: String = js.native
  }
  object IMessageDialog {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IMessageDialogMutableBuilder[Self <: IMessageDialog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelCommandIndex(value: Double): Self = StObject.set(x, "cancelCommandIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommands(value: IVector[IUICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCommandIndex(value: Double): Self = StObject.set(x, "defaultCommandIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: MessageDialogOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAsync(value: () => IAsyncOperation[IUICommand]): Self = StObject.set(x, "showAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMessageDialogFactory extends StObject {
    
    def create(content: String): MessageDialog = js.native
    
    def createWithTitle(content: String, title: String): MessageDialog = js.native
  }
  object IMessageDialogFactory {
    
    @scala.inline
    def apply(create: String => MessageDialog, createWithTitle: (String, String) => MessageDialog): IMessageDialogFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
      __obj.asInstanceOf[IMessageDialogFactory]
    }
    
    @scala.inline
    implicit class IMessageDialogFactoryMutableBuilder[Self <: IMessageDialogFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String => MessageDialog): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateWithTitle(value: (String, String) => MessageDialog): Self = StObject.set(x, "createWithTitle", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IPopupMenu extends StObject {
    
    var commands: IVector[IUICommand] = js.native
    
    def showAsync(invocationPoint: Point): IAsyncOperation[IUICommand] = js.native
    
    def showForSelectionAsync(selection: Rect): IAsyncOperation[IUICommand] = js.native
    def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[IUICommand] = js.native
  }
  
  @js.native
  trait IUICommand extends StObject {
    
    var id: js.Any = js.native
    
    def invoked(command: IUICommand): Unit = js.native
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    var label: String = js.native
  }
  
  @js.native
  trait IUICommandFactory extends StObject {
    
    def create(label: String): UICommand = js.native
    
    def createWithHandler(label: String, action: UICommandInvokedHandler): UICommand = js.native
    
    def createWithHandlerAndId(label: String, action: UICommandInvokedHandler, commandId: js.Any): UICommand = js.native
  }
  object IUICommandFactory {
    
    @scala.inline
    def apply(
      create: String => UICommand,
      createWithHandler: (String, UICommandInvokedHandler) => UICommand,
      createWithHandlerAndId: (String, UICommandInvokedHandler, js.Any) => UICommand
    ): IUICommandFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithHandler = js.Any.fromFunction2(createWithHandler), createWithHandlerAndId = js.Any.fromFunction3(createWithHandlerAndId))
      __obj.asInstanceOf[IUICommandFactory]
    }
    
    @scala.inline
    implicit class IUICommandFactoryMutableBuilder[Self <: IUICommandFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String => UICommand): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateWithHandler(value: (String, UICommandInvokedHandler) => UICommand): Self = StObject.set(x, "createWithHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateWithHandlerAndId(value: (String, UICommandInvokedHandler, js.Any) => UICommand): Self = StObject.set(x, "createWithHandlerAndId", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait MessageDialog extends IMessageDialog
  object MessageDialog {
    
    @scala.inline
    def apply(
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
  trait PopupMenu extends IPopupMenu
  
  @js.native
  trait UICommand extends IUICommand
  
  type UICommandInvokedHandler = js.Function1[/* command */ IUICommand, Unit]
  
  @js.native
  trait UICommandSeparator extends IUICommand
}
