package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaControllerClient extends StObject {
  
  /**
    * Adds a listener to be invoked when ability of the media controller server is changed.
    *
    * @since 5.5
    *
    * @remark Implicitly the media controller client will receive information about ability changes of every active media controller server.
    * To receive information only from selected servers, calling function [subscribe()](#MediaControllerAbilitiesInfo::subscribe) is required.
    *
    * @param listener Function to call on mediacontroller server's ability change.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addAbilityChangeListener(listener: MediaControllerAbilityChangeCallback): Double = js.native
  
  /**
    * Retrieves all activated media controller servers.
    *
    * @param successCallback The method to invoke when all of the registered media controller servers have been found.
    * @param errorCallback The method to invoke on failure of retrieving servers list.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def findServers(successCallback: MediaControllerServerInfoArraySuccessCallback): Unit = js.native
  def findServers(successCallback: MediaControllerServerInfoArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Retrieves all subscribed media controller servers.
    *
    * @since 5.5
    *
    * The ErrorCallback may be triggered for one of the following errors:
    *
    * *   UnknownError: if any error prevents function from successful completion.
    *
    *
    * @param successCallback The method to invoke when all of subscribed media controller servers have been found.
    * @param errorCallback The method to invoke on failure of retrieving servers list.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def findSubscribedServers(successCallback: MediaControllerServerInfoArraySuccessCallback): Unit = js.native
  def findSubscribedServers(successCallback: MediaControllerServerInfoArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the latest activated media controller server info.
    *
    * @remark If there is no activated media controller server, null value is returned.
    *
    * @returns Server info or null.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def getLatestServerInfo(): MediaControllerServerInfo | Null = js.native
  
  /**
    * Removes selected MediaControllerAbilityChangeListener.
    *
    * @since 5.5
    *
    * @remark All subscriptions added by function [subscribe()](#MediaControllerAbilitiesInfo::subscribe) will be lost after removing last MediaControllerAbilityChangeListener.
    *
    * @param watchId Subscription identifier returned by [addAbilityChangeListener()](#MediaControllerClient::addAbilityChangeListener).
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeAbilityChangeListener(watchId: Double): Unit = js.native
  
  /**
    * Sets the media controller client's listener for custom events from the server.
    *
    * If the listener has already been set, calling this method will override it.
    *
    * @since 5.5
    *
    * @param listener Event handling function.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of the arguments has invalid types.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def setCustomEventListener(listener: MediaControllerReceiveCommandCallback): Unit = js.native
  
  /**
    * Removes the server's events listener.
    *
    * Calling this function has no effect, if the listener is not set.
    *
    * @since 5.5
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def unsetCustomEventListener(): Unit = js.native
}
