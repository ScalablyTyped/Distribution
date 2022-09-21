package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePortManager extends StObject {
  
  /**
    * Requests a LocalMessagePort instance to start receiving message from another application.
    *
    * @param localMessagePortName Name of the local message port to retrieve
    * The LocalMessagePort instances are identical for the same message port name.
    *
    * @returns LocalMessagePort instance.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type InvalidValuesError, if the input parameter contains an invalid value.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def requestLocalMessagePort(localMessagePortName: String): LocalMessagePort
  
  /**
    * Requests a RemoteMessagePort instance to send message to another application.
    *
    * If the message port name and application ID are the same, the platform returns the same RemoteMessagePort instance.
    *
    * @param appId ID of the application to send messages.
    * @param remoteMessagePortName Name of remote message port.
    *
    * @returns RemoteMessagePort instance.
    *
    * @throw WebAPIException with error type NotFoundError, if the port of the target application is not found.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def requestRemoteMessagePort(appId: ApplicationId, remoteMessagePortName: String): RemoteMessagePort
  
  /**
    * Requests a trusted LocalMessagePort instance to receive message from another application.
    *
    * Trusted local message port can communicate with applications that are signed with same certificate.
    *
    * @param localMessagePortName Name of local message port
    * The LocalMessagePort instances are identical for the same message port name.
    *
    * @returns Trusted LocalMessagePort instance.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type InvalidValuesError, if the input parameter contains an invalid value.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def requestTrustedLocalMessagePort(localMessagePortName: String): LocalMessagePort
  
  /**
    * Requests a trusted RemoteMessagePort instance to receive message from another application.
    *
    * If the message port name and application ID are the same, the platform returns the same RemoteMessagePort instance.
    * Trusted remote message port can communicate with applications that are signed with same certificate.
    *
    * @param appId ID of the application to send messages.
    * @param remoteMessagePortName Name of remote message port.
    *
    * @returns Trusted RemoteMessagePort instance.
    *
    * @throw WebAPIException with error type NotFoundError, if the port of the target application is not found.
    * @throw WebAPIException with error type InvalidAccessError, if the target application is not signed with the same certification.
    * @throw WebAPIException with error type UnknownError, if any other error occurs
    */
  def requestTrustedRemoteMessagePort(appId: ApplicationId, remoteMessagePortName: String): RemoteMessagePort
}
object MessagePortManager {
  
  inline def apply(
    requestLocalMessagePort: String => LocalMessagePort,
    requestRemoteMessagePort: (ApplicationId, String) => RemoteMessagePort,
    requestTrustedLocalMessagePort: String => LocalMessagePort,
    requestTrustedRemoteMessagePort: (ApplicationId, String) => RemoteMessagePort
  ): MessagePortManager = {
    val __obj = js.Dynamic.literal(requestLocalMessagePort = js.Any.fromFunction1(requestLocalMessagePort), requestRemoteMessagePort = js.Any.fromFunction2(requestRemoteMessagePort), requestTrustedLocalMessagePort = js.Any.fromFunction1(requestTrustedLocalMessagePort), requestTrustedRemoteMessagePort = js.Any.fromFunction2(requestTrustedRemoteMessagePort))
    __obj.asInstanceOf[MessagePortManager]
  }
  
  extension [Self <: MessagePortManager](x: Self) {
    
    inline def setRequestLocalMessagePort(value: String => LocalMessagePort): Self = StObject.set(x, "requestLocalMessagePort", js.Any.fromFunction1(value))
    
    inline def setRequestRemoteMessagePort(value: (ApplicationId, String) => RemoteMessagePort): Self = StObject.set(x, "requestRemoteMessagePort", js.Any.fromFunction2(value))
    
    inline def setRequestTrustedLocalMessagePort(value: String => LocalMessagePort): Self = StObject.set(x, "requestTrustedLocalMessagePort", js.Any.fromFunction1(value))
    
    inline def setRequestTrustedRemoteMessagePort(value: (ApplicationId, String) => RemoteMessagePort): Self = StObject.set(x, "requestTrustedRemoteMessagePort", js.Any.fromFunction2(value))
  }
}
