package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  /**
    * Human-readable detail message that is rendered less prominent. _Note_ that detail
    * is only shown for {@link MessageOptions.modal modal} messages.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that this message should be modal.
    */
  var modal: js.UndefOr[Boolean] = js.undefined
}
object MessageOptions {
  
  inline def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
  }
}
