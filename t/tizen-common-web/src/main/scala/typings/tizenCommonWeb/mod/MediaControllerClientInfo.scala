package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaControllerClientInfo extends StObject {
  
  /**
    * Id of the client application.
    */
  val name: ApplicationId = js.native
  
  def sendEvent(eventName: String, data: Null, successCallback: MediaControllerSendCommandSuccessCallback): Unit = js.native
  /**
    * Sends an event to the client.
    *
    * @param eventName Name of the event.
    * @param data Additional event data.
    * @param successCallback Reply handling function.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any argument has invalid type.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendEvent(eventName: String, data: Bundle, successCallback: MediaControllerSendCommandSuccessCallback): Unit = js.native
}
