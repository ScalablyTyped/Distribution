package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageItem extends StObject {
  
  /**
    * A hint for modal dialogs that the item should be triggered
    * when the user cancels the dialog (e.g. by pressing the ESC
    * key).
    *
    * Note: this option is ignored for non-modal messages.
    */
  var isCloseAffordance: js.UndefOr[Boolean] = js.native
  
  /**
    * A short title like 'Retry', 'Open Log' etc.
    */
  var title: String = js.native
}
object MessageItem {
  
  @scala.inline
  def apply(title: String): MessageItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageItem]
  }
  
  @scala.inline
  implicit class MessageItemMutableBuilder[Self <: MessageItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCloseAffordance(value: Boolean): Self = StObject.set(x, "isCloseAffordance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCloseAffordanceUndefined: Self = StObject.set(x, "isCloseAffordance", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
