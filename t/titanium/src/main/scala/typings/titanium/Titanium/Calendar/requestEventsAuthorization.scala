package typings.titanium.Titanium.Calendar

import typings.titanium.EventsAuthorizationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Calendar.requestEventsAuthorization")
@js.native
object requestEventsAuthorization extends js.Object {
  /**
  		 * If authorization is unknown, will bring up a dialog requesting permission.
  		 */
  def apply(callback: js.Function1[/* param0 */ EventsAuthorizationResponse, _]): Unit = js.native
}

