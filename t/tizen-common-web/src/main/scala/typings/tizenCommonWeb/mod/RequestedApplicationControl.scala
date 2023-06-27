package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestedApplicationControl extends StObject {
  
  /**
    * An attribute to store the application control object that describes the caller application's request.
    * It contains the information that the calling application passed to _launchAppControl_.
    */
  val appControl: ApplicationControl = js.native
  
  /**
    * An attribute to store the caller application's ID.
    *
    * @since 2.1
    */
  val callerAppId: ApplicationId = js.native
  
  /**
    * Notifies the calling application that the application failed
    * to perform the requested action.
    *
    * @throws WebAPIException with error type NotFoundError, if the caller app is not alive or there is no response from the caller app.
    * @throws WebAPIException with error type UnknownError, if the reply request fails because of an unknown error.
    */
  def replyFailure(): Unit = js.native
  
  /**
    * Sends the results to the caller application.
    *
    * @param data An array of ApplicationControlData objects.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type NotFoundError, if the caller app is not alive or there is no response from the caller app.
    * @throws WebAPIException with error type UnknownError, if the reply request fails because of an unknown error.
    */
  def replyResult(): Unit = js.native
  def replyResult(data: js.Array[ApplicationControlData]): Unit = js.native
}
