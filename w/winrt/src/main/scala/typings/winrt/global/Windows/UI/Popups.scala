package typings.winrt.global.Windows.UI

import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popups {
  
  @JSGlobal("Windows.UI.Popups.MessageDialog")
  @js.native
  class MessageDialog protected ()
    extends typings.winrt.Windows.UI.Popups.MessageDialog {
    def this(content: String) = this()
    def this(content: String, title: String) = this()
  }
  
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Popups.MessageDialogOptions with Double] = js.native
    
    /* 1 */ val acceptUserInputAfterDelay: typings.winrt.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Popups.MessageDialogOptions.none with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Popups.Placement with Double] = js.native
    
    /* 0 */ val default: typings.winrt.Windows.UI.Popups.Placement.default with Double = js.native
    
    /* 1 */ val above: typings.winrt.Windows.UI.Popups.Placement.above with Double = js.native
    
    /* 2 */ val below: typings.winrt.Windows.UI.Popups.Placement.below with Double = js.native
    
    /* 3 */ val left: typings.winrt.Windows.UI.Popups.Placement.left with Double = js.native
    
    /* 4 */ val right: typings.winrt.Windows.UI.Popups.Placement.right with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Popups.PopupMenu")
  @js.native
  class PopupMenu ()
    extends typings.winrt.Windows.UI.Popups.PopupMenu
  
  @JSGlobal("Windows.UI.Popups.UICommand")
  @js.native
  class UICommand ()
    extends typings.winrt.Windows.UI.Popups.UICommand {
    def this(label: String) = this()
    def this(label: String, action: UICommandInvokedHandler) = this()
    def this(label: String, action: UICommandInvokedHandler, commandId: js.Any) = this()
  }
  
  @JSGlobal("Windows.UI.Popups.UICommandSeparator")
  @js.native
  class UICommandSeparator ()
    extends typings.winrt.Windows.UI.Popups.UICommandSeparator
}
