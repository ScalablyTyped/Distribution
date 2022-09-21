package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupToastProps
  extends StObject
     with ModalProps {
  
  /**
    * @language zh-CN
    * @description 文案内容
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Message
    * @defaultValue ''
    */
  var message: js.UndefOr[String] = js.undefined
}
object PopupToastProps {
  
  inline def apply(): PopupToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupToastProps]
  }
  
  extension [Self <: PopupToastProps](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
