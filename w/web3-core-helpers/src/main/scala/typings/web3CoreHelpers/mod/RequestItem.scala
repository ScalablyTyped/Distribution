package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestItem extends StObject {
  
  def callback(error: Any, result: Any): Unit
  
  var payload: JsonRpcPayload
}
object RequestItem {
  
  inline def apply(callback: (Any, Any) => Unit, payload: JsonRpcPayload): RequestItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestItem] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: (Any, Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setPayload(value: JsonRpcPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
