package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowDialog extends StObject {
  
  def backButtonCommand(command: IUICommand): Unit
  @JSName("backButtonCommand")
  var backButtonCommand_Original: UICommandInvokedHandler
  
  var cancelCommandIndex: Double
  
  var commands: IVector[IUICommand]
  
  var defaultCommandIndex: Double
  
  var isInteractionDelayed: Double
  
  var maxSize: Size
  
  var minSize: Size
  
  var onshowing: js.Any
  
  def showAsync(): IAsyncOperation[IUICommand]
  
  var title: String
}
object ICoreWindowDialog {
  
  @scala.inline
  def apply(
    backButtonCommand: /* command */ IUICommand => Unit,
    cancelCommandIndex: Double,
    commands: IVector[IUICommand],
    defaultCommandIndex: Double,
    isInteractionDelayed: Double,
    maxSize: Size,
    minSize: Size,
    onshowing: js.Any,
    showAsync: () => IAsyncOperation[IUICommand],
    title: String
  ): ICoreWindowDialog = {
    val __obj = js.Dynamic.literal(backButtonCommand = js.Any.fromFunction1(backButtonCommand), cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], isInteractionDelayed = isInteractionDelayed.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindowDialog]
  }
  
  @scala.inline
  implicit class ICoreWindowDialogMutableBuilder[Self <: ICoreWindowDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackButtonCommand(value: /* command */ IUICommand => Unit): Self = StObject.set(x, "backButtonCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelCommandIndex(value: Double): Self = StObject.set(x, "cancelCommandIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: IVector[IUICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCommandIndex(value: Double): Self = StObject.set(x, "defaultCommandIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInteractionDelayed(value: Double): Self = StObject.set(x, "isInteractionDelayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Size): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnshowing(value: js.Any): Self = StObject.set(x, "onshowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsync(value: () => IAsyncOperation[IUICommand]): Self = StObject.set(x, "showAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
