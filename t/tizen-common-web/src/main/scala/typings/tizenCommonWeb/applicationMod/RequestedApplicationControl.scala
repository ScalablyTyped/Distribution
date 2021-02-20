package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestedApplicationControl extends StObject {
  
  /**
    * An attribute to store the application control object that describes the caller application's request.
    * It contains the information that the calling application passed to `launchAppControl`.
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
    *
    * @throw WebAPIException NotFoundError, UnknownError
    *
    */
  def replyFailure(): Unit = js.native
  
  /**
    * Sends the results to the caller application.
    *
    *
    * @param data An array of ApplicationControlData objects.
    *
    * @throw WebAPIException TypeMismatchError, NotFoundError, UnknownError
    *
    */
  def replyResult(): Unit = js.native
  def replyResult(data: js.Array[ApplicationControlData]): Unit = js.native
}
