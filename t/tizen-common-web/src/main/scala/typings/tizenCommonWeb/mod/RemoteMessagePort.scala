package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteMessagePort extends StObject {
  
  /**
    * The application ID to connect with.
    */
  val appId: ApplicationId = js.native
  
  /**
    * The flag indicating whether the message port is trusted.
    */
  val isTrusted: Boolean = js.native
  
  /**
    * The message port name.
    */
  val messagePortName: String = js.native
  
  /**
    * Sends messages to the specified application.
    *
    * The sent messages will be ignored without any notice, unless the target application added one or more listeners to the target local message port.
    *
    * @param data Array of data to send.
    * @param localMessagePort _LocalMessagePort_ object that gives local message port of the current application
    * It can be used to receive reply messages from the other end of the message port.
    * The order of items in this array is not guaranteed to be preserved during data transfer, and values of _key_ within this
    * array must not be duplicated or empty.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throws WebAPIException with error type InvalidValuesError, if an input parameter contains an invalid value.
    * @throws WebAPIException with error type QuotaExceededError, if the size of message has exceeded the maximum limit.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendMessage(data: js.Array[MessagePortDataItem]): Unit = js.native
  def sendMessage(data: js.Array[MessagePortDataItem], localMessagePort: LocalMessagePort): Unit = js.native
}
