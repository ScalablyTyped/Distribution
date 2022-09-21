package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  /**
    * Adds child resource into the parent resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param resource The child resource to be added to the parent resource.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def addChildResource(resource: Resource): Unit = js.native
  
  /**
    * Adds resource interface to this resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param interface The interface to be added to resource.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def addResourceInterface(interface: ResourceInterface): Unit = js.native
  
  /**
    * Adds resource type to this resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param types An array of types to be added to resource.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def addResourceTypes(types: js.Array[ResourceType]): Unit = js.native
  
  /**
    * A lists of attributes of this resource.
    */
  var attributes: Any = js.native
  
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
    * Notifies specific clients that resource's attributes have been changed.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param qosLevel The quality of service level.
    * @param observerIds A list of observer id.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter does not contain a valid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def notify(qosLevel: QosLevel): Unit = js.native
  def notify(qosLevel: QosLevel, observerIds: js.Array[Double]): Unit = js.native
  
  /**
    * A list of observation IDs of this resource.
    */
  val observerIds: js.Array[Double] = js.native
  
  /**
    * Removes child resource from the parent resource.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param resource The child resource to be removed from the parent resource.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if the resource does not have the input child resource.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, If the operation has been stopped.
    */
  def removeChildResource(resource: Resource): Unit = js.native
  
  /**
    * A list of interfaces in the resource.
    */
  val resourceInterfaces: js.Array[ResourceInterface] = js.native
  
  /**
    * A list of types in this resource.
    */
  val resourceTypes: js.Array[ResourceType] = js.native
  
  /**
    * A list of children of this resource.
    */
  val resources: js.Array[Resource] = js.native
  
  /**
    * Sets the listener for request from client.
    *
    * @param listener Request listener to set.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    */
  def setRequestListener(listener: RequestCallback): Unit = js.native
  
  /**
    * Remove the listener.
    *
    * Calling this function has no effect if listener was not set.
    *
    * @remark Example of using can be find at [setRequestListener](iotcon.html#Resource::setRequestListener) code example.
    */
  def unsetRequestListener(): Unit = js.native
  
  /**
    * The resource URI.
    */
  val uriPath: String = js.native
}
