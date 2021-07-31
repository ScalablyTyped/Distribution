package typings.vscodeJsonrpc.messagesMod

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
  var params: js.UndefOr[js.Any] = js.undefined
}
object NotificationMessage {
  
  @scala.inline
  def apply(jsonrpc: String, method: String): NotificationMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessage]
  }
  
  @scala.inline
  implicit class NotificationMessageMutableBuilder[Self <: NotificationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
