package typings.winrtUwp.Windows.ApplicationModel.AppService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppServiceResponseStatus extends js.Object

/** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponseStatus")
@js.native
object AppServiceResponseStatus extends js.Object {
  /** The app service failed to receive and process the message. */
  @js.native
  sealed trait failure extends AppServiceResponseStatus
  
  /** The app service exited because not enough resources were available. */
  @js.native
  sealed trait resourceLimitsExceeded extends AppServiceResponseStatus
  
  /** The app service successfully received and processed the message. */
  @js.native
  sealed trait success extends AppServiceResponseStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknown extends AppServiceResponseStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppServiceResponseStatus with Double] = js.native
  /* 1 */ @js.native
  object failure extends TopLevel[failure with Double]
  
  /* 2 */ @js.native
  object resourceLimitsExceeded extends TopLevel[resourceLimitsExceeded with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

