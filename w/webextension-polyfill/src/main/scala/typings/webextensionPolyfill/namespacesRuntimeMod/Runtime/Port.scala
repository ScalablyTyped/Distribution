package typings.webextensionPolyfill.namespacesRuntimeMod.Runtime

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which allows two way communication with other pages.
  */
trait Port extends StObject {
  
  def disconnect(): Unit
  
  /**
    * If the port was disconnected due to an error, this will be set to an object with a string property message,
    * giving you more information about the error. See onDisconnect.
    * Optional.
    */
  var error: js.UndefOr[PortErrorType] = js.undefined
  
  var name: String
  
  /**
    * @param port
    */
  var onDisconnect: Event[js.Function1[/* port */ this.type, Unit]]
  
  /**
    * @param message
    * @param port
    */
  var onMessage: Event[js.Function2[/* message */ Any, /* port */ this.type, Unit]]
  
  /**
    * Send a message to the other end. This takes one argument, which is a JSON object representing the message to send.
    * It will be delivered to any script listening to the port's onMessage event, or to the native application if this port
    * is connected to a native application.
    *
    * @param message
    */
  def postMessage(message: Any): Unit
  
  /**
    * This property will <b>only</b> be present on ports passed to onConnect/onConnectExternal listeners.
    * Optional.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
}
object Port {
  
  inline def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: Event[js.Function1[Port, Unit]],
    onMessage: Event[js.Function2[/* message */ Any, Port, Unit]],
    postMessage: Any => Unit
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setError(value: PortErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnDisconnect(value: Event[js.Function1[Port, Unit]]): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: Event[js.Function2[/* message */ Any, Port, Unit]]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    inline def setSender(value: MessageSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
