package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  def addPresenceEventListener(
    hostAddress: String,
    resourceType: Null,
    connectivityType: ConnectivityType,
    successCallback: PresenceEventCallback
  ): Double = js.native
  /**
    * Adds a listener to receive a presence events from the server.
    * A server sends presence events when starts or stops presence.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param hostAddress The address of host, null indicates that this is for all nodes(multicast).
    * @param resourceType The resource type specified as a filter for the resource. The characters should have length less than or equal to 61 and start with a lowercase alphabetic. followed by a sequence of lowercase alphabetic, numeric, ".", or "-" characters, and contains no white space.
    * @param connectivityType The connectivity type.
    * @param successCallback The method to invoked when a presence event is received.
    *
    * @returns The watchID which can be used to remove the listener.
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def addPresenceEventListener(
    hostAddress: String,
    resourceType: ResourceType,
    connectivityType: ConnectivityType,
    successCallback: PresenceEventCallback
  ): Double = js.native
  def addPresenceEventListener(
    hostAddress: Null,
    resourceType: Null,
    connectivityType: ConnectivityType,
    successCallback: PresenceEventCallback
  ): Double = js.native
  def addPresenceEventListener(
    hostAddress: Null,
    resourceType: ResourceType,
    connectivityType: ConnectivityType,
    successCallback: PresenceEventCallback
  ): Double = js.native
  
  def findDeviceInfo(
    hostAddress: String,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback
  ): Unit = js.native
  def findDeviceInfo(
    hostAddress: String,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  /**
    * Gets the device information of remote server.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   TimeoutError: If there is no resource or response within timeout value.
    * *   AbortError: If any system error is invoked
    *
    *
    * @remark hostAddress should be in the format coap://Address:port. For example "coaps://\[fe80::ae5a:14ff:fe24:b8fe\]:12345" or "coaps://192.168.1.10:12345".
    *
    * @param hostAddress The address of host, null indicates that this is for all nodes(multicast).
    * @param query The query specified as a filter. null means no filter.
    * @param connectivityType The connectivity type.
    * @param successCallback The method to invoked when device information is found.
    * @param errorCallback The method to invoke on failure of getting device information.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def findDeviceInfo(
    hostAddress: String,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback
  ): Unit = js.native
  def findDeviceInfo(
    hostAddress: String,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def findDeviceInfo(
    hostAddress: Null,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback
  ): Unit = js.native
  def findDeviceInfo(
    hostAddress: Null,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def findDeviceInfo(
    hostAddress: Null,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback
  ): Unit = js.native
  def findDeviceInfo(
    hostAddress: Null,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundDeviceInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  def findPlatformInfo(
    hostAddress: String,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback
  ): Unit = js.native
  def findPlatformInfo(
    hostAddress: String,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  /**
    * Gets the platform information of remote server.
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
    * @remark hostAddress should be in the format coap://Address:port. For example "coaps://\[fe80::ae5a:14ff:fe24:b8fe\]:12345" or "coaps://192.168.1.10:12345".
    *
    * @param hostAddress The address of host, null indicates that this is for all nodes(multicast).
    * @param query The query specified as a filter. null means no filter.
    * @param connectivityType The connectivity type.
    * @param successCallback The method to invoked when platform information is found.
    * @param errorCallback The method to invoke on failure of getting platform information.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def findPlatformInfo(
    hostAddress: String,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback
  ): Unit = js.native
  def findPlatformInfo(
    hostAddress: String,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def findPlatformInfo(
    hostAddress: Null,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback
  ): Unit = js.native
  def findPlatformInfo(
    hostAddress: Null,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def findPlatformInfo(
    hostAddress: Null,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback
  ): Unit = js.native
  def findPlatformInfo(
    hostAddress: Null,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundPlatformInfoSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  def findResource(
    hostAddress: String,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback
  ): Unit = js.native
  def findResource(
    hostAddress: String,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  /**
    * Finds resources using host address and resource type.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * The ErrorCallback is launched with these error types:
    *
    * *   TimeoutError: If there is no resource or response within timeout value.
    * *   AbortError: If any system error is invoked
    *
    *
    * @remark hostAddress should be in the format coap://Address:port. For example "coaps://\[fe80::ae5a:14ff:fe24:b8fe\]:12345" or "coaps://192.168.1.10:12345".
    *
    * @param hostAddress The address of host, null indicates that this is for all nodes(multicast).
    * @param query The query specified as a filter for the resource. null means no filter.
    * @param connectivityType The connectivity type.
    * @param successCallback The method to invoked when a resource is found.
    * @param errorCallback The method to invoke on failure of finding resource.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def findResource(
    hostAddress: String,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback
  ): Unit = js.native
  def findResource(
    hostAddress: String,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def findResource(
    hostAddress: Null,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback
  ): Unit = js.native
  def findResource(
    hostAddress: Null,
    query: Null,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def findResource(
    hostAddress: Null,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback
  ): Unit = js.native
  def findResource(
    hostAddress: Null,
    query: Query,
    connectivityType: ConnectivityType,
    successCallback: FoundResourceSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Unregisters a presence event listener.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark Example of using can be find at [addPresenceEventListener](iotcon.html#Client::addPresenceEventListener) code example.
    *
    * @param watchId The watchID identifier returned by the addPresenceEventListener() method.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type AbortError, if the operation has been stopped or listener for given watchId was not found.
    */
  def removePresenceEventListener(watchId: Double): Unit = js.native
}
