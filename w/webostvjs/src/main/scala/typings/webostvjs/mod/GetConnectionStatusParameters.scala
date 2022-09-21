package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionStatusParameters extends StObject {
  
  /**
    * The callback function called when the method fails.
    */
  def onFailure(error: FailureResponse): Unit
  
  /**
    * The callback function called when the method succeeds.
    */
  def onSuccess(result: ConnectionStatus): Unit
  
  /**
    * Indicates whether to subscribe the network connection status.
    * - true: Subscribe the network connection status.
    * - false: Not subscribe the network connection status.
    */
  var subscribe: Boolean
}
object GetConnectionStatusParameters {
  
  inline def apply(onFailure: FailureResponse => Unit, onSuccess: ConnectionStatus => Unit, subscribe: Boolean): GetConnectionStatusParameters = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), subscribe = subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionStatusParameters]
  }
  
  extension [Self <: GetConnectionStatusParameters](x: Self) {
    
    inline def setOnFailure(value: FailureResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnSuccess(value: ConnectionStatus => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
  }
}
