package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "TaskRouterWorkerCapability")
@js.native
class TaskRouterWorkerCapability protected () extends TaskRouterCapability {
  def this(accountSid: String, authToken: String, workspaceSid: String, workerSid: String) = this()
  
  var activityUrl: String = js.native
  
  def allowActivityUpdates(): Unit = js.native
  
  def allowReservationUpdates(): Unit = js.native
  
  var reservationsUrl: String = js.native
  
  var workerReservationsUrl: String = js.native
}
