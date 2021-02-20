package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMessage extends Message {
  
  /**
    * The request id.
    */
  var id: Double | String = js.native
  
  /**
    * The method to be invoked.
    */
  var method: String = js.native
  
  /**
    * The method's params.
    */
  var params: js.UndefOr[js.Any] = js.native
}
object RequestMessage {
  
  @scala.inline
  def apply(id: Double | String, jsonrpc: String, method: String): RequestMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMessage]
  }
  
  @scala.inline
  implicit class RequestMessageMutableBuilder[Self <: RequestMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
