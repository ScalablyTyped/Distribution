package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "RemoteResource")
@js.native
open class RemoteResource () extends StObject {
  
  /**
    * The cached representation of remote resource.
    */
  val cachedRepresentation: Representation | Null = js.native
  
  /**
    * It is connectivity type.
    */
  val connectivityType: ConnectivityType = js.native
  
  /**
    * The device unique id. this is unique per-server independent on how it was discovered.
    */
  val deviceId: String = js.native
  
  /**
    * The device name of the remote resource.
    */
  val deviceName: String = js.native
  
  /**
    * The host address
    */
  val hostAddress: String = js.native
  
  /**
    * Indicates if the resource is initialized and activated or not
    */
  val isActive: Boolean = js.native
  
  /**
    * Indicates if the resource is discoverable or not
    */
  val isDiscoverable: Boolean = js.native
  
  /**
    * Indicates if the resource is is allowed to be discovered only if discovery request contains an explicit query string or not
    */
  val isExplicitDiscoverable: Boolean = js.native
  
  /**
    * Indicates if the resource is observable or not
    */
  val isObservable: Boolean = js.native
  
  /**
    * Indicates if the resource is secure or not
    */
  val isSecure: Boolean = js.native
  
  /**
    * Indicates if the resource takes some delay to respond or not
    */
  val isSlow: Boolean = js.native
  
  /**
    * Deletes the remote resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   TimeoutError: If there is no resource or response within timeout value.
    * *   AbortError: In any system error is invoked
    *
    *
    * @param responseCallback The method to invoked when a client receive get response.
    * @param errorCallback The method to invoke on failure of getting response.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def methodDelete(responseCallback: RemoteResourceResponseCallback): Unit = js.native
  def methodDelete(responseCallback: RemoteResourceResponseCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the attributes of a resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   TimeoutError: If there is no resource or response within timeout value.
    * *   AbortError: In any system error is invoked
    *
    *
    * @param responseCallback The method to invoked when a client receive get response.
    * @param query The query to send to server. The resource request handler should handle this value.
    * @param errorCallback The method to invoke on failure of getting response.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def methodGet(responseCallback: RemoteResourceResponseCallback): Unit = js.native
  def methodGet(responseCallback: RemoteResourceResponseCallback, query: Null, errorCallback: ErrorCallback): Unit = js.native
  def methodGet(responseCallback: RemoteResourceResponseCallback, query: Unit, errorCallback: ErrorCallback): Unit = js.native
  def methodGet(responseCallback: RemoteResourceResponseCallback, query: Query): Unit = js.native
  def methodGet(responseCallback: RemoteResourceResponseCallback, query: Query, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Posts the representation of a resource for create.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   TimeoutError: If there is no resource or response within timeout value.
    * *   AbortError: In any system error is invoked
    *
    *
    * @param representation The payload of a request or a response.
    * @param responseCallback The method to invoked when a client receive get response.
    * @param query The query to send to server. The resource request handler should handle this value.
    * @param errorCallback The method to invoke on failure of getting response.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def methodPost(representation: Representation, responseCallback: RemoteResourceResponseCallback): Unit = js.native
  def methodPost(
    representation: Representation,
    responseCallback: RemoteResourceResponseCallback,
    query: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def methodPost(
    representation: Representation,
    responseCallback: RemoteResourceResponseCallback,
    query: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def methodPost(representation: Representation, responseCallback: RemoteResourceResponseCallback, query: Query): Unit = js.native
  def methodPost(
    representation: Representation,
    responseCallback: RemoteResourceResponseCallback,
    query: Query,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Puts the representation of a resource for update.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   TimeoutError: If there is no resource or response within timeout value.
    * *   AbortError: In any system error is invoked
    *
    *
    * @param representation The payload of a request or a response.
    * @param responseCallback The method to invoked when a client receive get response.
    * @param query The query to send to server. The resource request handler should handle this value.
    * @param errorCallback The method to invoke on failure of getting response.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def methodPut(representation: Representation, responseCallback: RemoteResourceResponseCallback): Unit = js.native
  def methodPut(
    representation: Representation,
    responseCallback: RemoteResourceResponseCallback,
    query: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def methodPut(
    representation: Representation,
    responseCallback: RemoteResourceResponseCallback,
    query: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def methodPut(representation: Representation, responseCallback: RemoteResourceResponseCallback, query: Query): Unit = js.native
  def methodPut(
    representation: Representation,
    responseCallback: RemoteResourceResponseCallback,
    query: Query,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * The option for managing vendor specific option of COAP packet.
    *
    * @remark Options can have up to 2 IotconOption.
    */
  var options: js.Array[IotconOption] | Null = js.native
  
  /**
    * A list of interfaces in the resource.
    */
  val resourceInterfaces: js.Array[ResourceInterface] = js.native
  
  /**
    * A list of types in this resource
    */
  val resourceTypes: js.Array[ResourceType] = js.native
  
  /**
    * Sets a listener to monitor the state of the remote resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param successCallback The method to invoked when remote resource's state is changed, registered callbacks will be called in turn. Internally, it checks the state of resource, periodically. Thus, it may not receive the state, immediately.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def setResourceStateChangeListener(successCallback: ResourceStateChangeCallback): Unit = js.native
  
  /**
    * Starts caching of a remote resource. cached representation is updated when remote resource is changed.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param updatedCallback The method to invoked when the remote resource is changed.
    *
    * @throw WebAPIException with error type InvalidStateError, this error occur when already started.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def startCaching(): Unit = js.native
  def startCaching(updatedCallback: CacheUpdatedCallback): Unit = js.native
  
  /**
    * Sets the listener to receive notification about attribute change of remote resource. When server sends notification message, successCallback will be called.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param observePolicy The policy of observation.
    * @param successCallback The method to invoked when the resource receive notification message.
    * @param query The query to send to server. The resource request handler should handle this value.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def startObserving(observePolicy: ObservePolicy, successCallback: RemoteResourceResponseCallback): Unit = js.native
  def startObserving(observePolicy: ObservePolicy, successCallback: RemoteResourceResponseCallback, query: Query): Unit = js.native
  
  /**
    * Stops caching of a remote resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark Example of using can be find at [startCaching](iotcon.html#RemoteResource::startCaching) code example.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped
    */
  def stopCaching(): Unit = js.native
  
  /**
    * Unregisters the listener. so stop receiving notification about attribute change of remote resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark Example of using can be find at [startObserving](iotcon.html#RemoteResource::startObserving) code example.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def stopObserving(): Unit = js.native
  
  /**
    * The time interval in seconds for monitoring state (registered with setResourceStateChangeListener() ) and caching (registered with startCaching() ). Provided value must be in range from 1 to 3600 inclusive. The default value is 10 seconds.
    */
  var timeInterval: Double = js.native
  
  /**
    * Unsets the listener to stop monitoring the state of the remote resource.
    *
    * Calling this function has no effect if listener is not set.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark Example of using can be find at [setResourceStateChangeListener](iotcon.html#RemoteResource::setResourceStateChangeListener) code example.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def unsetResourceStateChangeListener(): Unit = js.native
  
  /**
    * The resource URI.
    */
  val uriPath: String = js.native
}
