package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerManager extends StObject {
  
  /**
    * Creates the Server object which holds playback state, meta data
    * and is controlled by Client.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/mediacontroller.server
    *
    * @returns The _MediaController Server_ object.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def createServer(): MediaControllerServer
  
  /**
    * Gets the client object. If not exist, client will be automatically created.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/mediacontroller.client
    *
    * @returns The _MediaController Client_ object.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getClient(): MediaControllerClient
}
object MediaControllerManager {
  
  inline def apply(createServer: () => MediaControllerServer, getClient: () => MediaControllerClient): MediaControllerManager = {
    val __obj = js.Dynamic.literal(createServer = js.Any.fromFunction0(createServer), getClient = js.Any.fromFunction0(getClient))
    __obj.asInstanceOf[MediaControllerManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerManager] (val x: Self) extends AnyVal {
    
    inline def setCreateServer(value: () => MediaControllerServer): Self = StObject.set(x, "createServer", js.Any.fromFunction0(value))
    
    inline def setGetClient(value: () => MediaControllerClient): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
  }
}
