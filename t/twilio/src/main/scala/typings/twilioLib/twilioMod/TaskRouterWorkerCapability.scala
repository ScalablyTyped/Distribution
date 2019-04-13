package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "TaskRouterWorkerCapability")
@js.native
class TaskRouterWorkerCapability protected () extends TaskRouterCapability {
  def this(accountSid: java.lang.String, authToken: java.lang.String, workspaceSid: java.lang.String, workerSid: java.lang.String) = this()
  var activityUrl: java.lang.String = js.native
  var reservationsUrl: java.lang.String = js.native
  var workerReservationsUrl: java.lang.String = js.native
  def allowActivityUpdates(): scala.Unit = js.native
  def allowReservationUpdates(): scala.Unit = js.native
}

