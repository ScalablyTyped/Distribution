package typings.winrtDashUwp.Windows.ApplicationModel.AppService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppServiceClosedStatus extends js.Object

/** Describes the status that was set when the endpoint for the app service was closed. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedStatus")
@js.native
object AppServiceClosedStatus extends js.Object {
  /** The endpoint for the app service was closed by the client or the system */
  @js.native
  sealed trait canceled extends AppServiceClosedStatus
  
  /** The endpoint for the app service closed gracefully. */
  @js.native
  sealed trait completed extends AppServiceClosedStatus
  
  /** The endpoint for the app service was closed because the endpoint ran out of resources. */
  @js.native
  sealed trait resourceLimitsExceeded extends AppServiceClosedStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknown extends AppServiceClosedStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppServiceClosedStatus with Double] = js.native
  /* 1 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 0 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object resourceLimitsExceeded extends TopLevel[resourceLimitsExceeded with Double]
  
  /* 3 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

