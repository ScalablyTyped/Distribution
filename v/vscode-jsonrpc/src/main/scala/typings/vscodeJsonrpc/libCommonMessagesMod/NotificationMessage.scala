package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationMessage
  extends StObject
     with Message {
  
  /**
    * The method to be invoked.
    */
  var method: String
  
  /**
    * The notification's params.
    */
  var params: js.UndefOr[js.Array[Any] | js.Object] = js.undefined
}
object NotificationMessage {
  
  inline def apply(jsonrpc: String, method: String): NotificationMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationMessage] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Any] | js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
