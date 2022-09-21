package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends StObject {
  
  /**
    * Creates a resource and registers the resource on server.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param uriPath The resource URI.
    * @param resourceTypes A list of types in this resource.
    * @param resourceInterfaces A list of interfaces in this resource.
    * @param listener The request listener, which is called when server receives request from client.
    * @param policy The policy for new Resource object.
    *
    * @returns Instance of _Resource_ object.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def createResource(
    uriPath: String,
    resourceTypes: js.Array[ResourceType],
    resourceInterfaces: js.Array[ResourceInterface],
    listener: RequestCallback
  ): Resource = js.native
  def createResource(
    uriPath: String,
    resourceTypes: js.Array[ResourceType],
    resourceInterfaces: js.Array[ResourceInterface],
    listener: RequestCallback,
    policy: ResourcePolicy
  ): Resource = js.native
  
  /**
    * Returns an array of resources which are registered on the server.
    *
    * @returns Array of _Resource_ objects registered on server.
    *
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def getResources(): js.Array[Resource] = js.native
  
  /**
    * Removes the resource and unregisters it from server.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @param resource The resource object to delete.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def removeResource(resource: Resource): Unit = js.native
  
  /**
    * Starts sending presence event of server. Server can send presence event to client when become online for the first time or come back from offline to online.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark If Server does not call startPresence(), client cannot get presence event with addPresenceEventListener().
    *
    * @remark If timeToLive is 0, server will set default value as 60 seconds. If timeToLive is bigger than maximum seconds, server will set maximum value as (60 \* 60 \* 24) seconds (24 hours).
    *
    * @param timeToLive The interval of announcing presence in seconds(value must range between 1 and 60 \* 60 \* 24 inclusive). default value is 60 seconds.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def startPresence(timeToLive: Double): Unit = js.native
  
  /**
    * Stops sending presence announcement of a server.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/internet
    *
    * @remark Example of using can be find at [startPresence](iotcon.html#Server::startPresence) code example.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type AbortError, if the operation has been stopped.
    */
  def stopPresence(): Unit = js.native
}
