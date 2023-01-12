package typings.wdioProtocols.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusReturn
  extends StObject
     with ProtocolCommandResponse {
  
  var message: js.UndefOr[String] = js.undefined
  
  var ready: js.UndefOr[Boolean] = js.undefined
}
object StatusReturn {
  
  inline def apply(): StatusReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReturn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusReturn] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
