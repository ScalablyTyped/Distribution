package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  /**
    * Indicates that this message should be modal.
    */
  var modal: js.UndefOr[Boolean] = js.undefined
}
object MessageOptions {
  
  @scala.inline
  def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  
  @scala.inline
  implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
  }
}
