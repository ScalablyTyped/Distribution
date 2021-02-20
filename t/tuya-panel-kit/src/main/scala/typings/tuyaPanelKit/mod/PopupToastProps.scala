package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupToastProps extends ModalProps {
  
  var message: js.UndefOr[String] = js.native
}
object PopupToastProps {
  
  @scala.inline
  def apply(): PopupToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupToastProps]
  }
  
  @scala.inline
  implicit class PopupToastPropsMutableBuilder[Self <: PopupToastProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
