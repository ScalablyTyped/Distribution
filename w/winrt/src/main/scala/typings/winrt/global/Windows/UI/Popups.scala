package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.MessageDialogOptions
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popups {
  
  @JSGlobal("Windows.UI.Popups.MessageDialog")
  @js.native
  class MessageDialog protected ()
    extends StObject
       with typings.winrt.Windows.UI.Popups.MessageDialog {
    def this(content: String) = this()
    def this(content: String, title: String) = this()
    
    /* CompleteClass */
    var cancelCommandIndex: Double = js.native
    
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /* CompleteClass */
    var content: String = js.native
    
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /* CompleteClass */
    var options: MessageDialogOptions = js.native
    
    /* CompleteClass */
    override def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Popups.MessageDialogOptions & Double] = js.native
    
    /* 1 */ val acceptUserInputAfterDelay: typings.winrt.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Popups.MessageDialogOptions.none & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Popups.Placement & Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.UI.Popups.Placement.default & Double = js.native
    
    /* 1 */ val above: typings.winrt.Windows.UI.Popups.Placement.above & Double = js.native
    
    /* 2 */ val below: typings.winrt.Windows.UI.Popups.Placement.below & Double = js.native
    
    /* 3 */ val left: typings.winrt.Windows.UI.Popups.Placement.left & Double = js.native
    
    /* 4 */ val right: typings.winrt.Windows.UI.Popups.Placement.right & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.PopupMenu")
  @js.native
  class PopupMenu ()
    extends StObject
       with typings.winrt.Windows.UI.Popups.PopupMenu
  
  @JSGlobal("Windows.UI.Popups.UICommand")
  @js.native
  class UICommand ()
    extends StObject
       with typings.winrt.Windows.UI.Popups.UICommand {
    def this(label: String) = this()
    def this(label: String, action: UICommandInvokedHandler) = this()
    def this(label: String, action: UICommandInvokedHandler, commandId: js.Any) = this()
    
    /* CompleteClass */
    var id: js.Any = js.native
    
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.UICommandSeparator")
  @js.native
  class UICommandSeparator ()
    extends StObject
       with typings.winrt.Windows.UI.Popups.UICommandSeparator {
    
    /* CompleteClass */
    var id: js.Any = js.native
    
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
}
