package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalMessagePort extends StObject {
  
  /**
    * Adds a message port listener to receive messages from other applications.
    *
    * @param listener Callback function that is called when a message is received.
    *
    * @returns ID of the listener that is later used to remove the listener.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type InvalidValuesError, if the input parameter contains an invalid value.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addMessagePortListener(listener: MessagePortCallback): Double
  
  /**
    * The flag indicating whether the message port is trusted.
    */
  val isTrusted: Boolean
  
  /**
    * The name of the message port name.
    */
  val messagePortName: String
  
  /**
    * Removes the message port listener.
    *
    * @param watchId ID to identify the listener.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type InvalidValuesError, if the input parameter contains an invalid value.
    * @throw WebAPIException with error type NotFoundError, if the watch ID has not been found.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def removeMessagePortListener(watchId: Double): Unit
}
object LocalMessagePort {
  
  inline def apply(
    addMessagePortListener: MessagePortCallback => Double,
    isTrusted: Boolean,
    messagePortName: String,
    removeMessagePortListener: Double => Unit
  ): LocalMessagePort = {
    val __obj = js.Dynamic.literal(addMessagePortListener = js.Any.fromFunction1(addMessagePortListener), isTrusted = isTrusted.asInstanceOf[js.Any], messagePortName = messagePortName.asInstanceOf[js.Any], removeMessagePortListener = js.Any.fromFunction1(removeMessagePortListener))
    __obj.asInstanceOf[LocalMessagePort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalMessagePort] (val x: Self) extends AnyVal {
    
    inline def setAddMessagePortListener(value: MessagePortCallback => Double): Self = StObject.set(x, "addMessagePortListener", js.Any.fromFunction1(value))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setMessagePortName(value: String): Self = StObject.set(x, "messagePortName", value.asInstanceOf[js.Any])
    
    inline def setRemoveMessagePortListener(value: Double => Unit): Self = StObject.set(x, "removeMessagePortListener", js.Any.fromFunction1(value))
  }
}
