package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUICommand extends js.Object {
  
  var id: js.Any = js.native
  
  def invoked(command: IUICommand): Unit = js.native
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  
  var label: String = js.native
}
