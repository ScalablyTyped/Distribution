package typings.twilio.anon

import typings.twilio.taskRouterCapabilityMod.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofutil extends StObject {
  
  def activitiesUrl(workspaceSid: String): String = js.native
  def activitiesUrl(workspaceSid: String, activitySid: String): String = js.native
  
  def defaultEventBridgePolicies(accountSid: String, channelId: String): js.Array[Policy] = js.native
  
  def defaultWorkerPolicies(version: String, workspaceSid: String, workerSid: String): js.Array[Policy] = js.native
  
  def reservationsUrl(workspaceSid: String, workerSid: String): String = js.native
  def reservationsUrl(workspaceSid: String, workerSid: String, reservationSid: String): String = js.native
  
  def taskQueuesUrl(workspaceSid: String): String = js.native
  def taskQueuesUrl(workspaceSid: String, taskQueueSid: String): String = js.native
  
  def tasksUrl(workspaceSid: String): String = js.native
  def tasksUrl(workspaceSid: String, taskSid: String): String = js.native
  
  def workersUrl(workspaceSid: String): String = js.native
  def workersUrl(workspaceSid: String, workerSid: String): String = js.native
  
  def workspacesUrl(): String = js.native
  def workspacesUrl(workspaceSid: String): String = js.native
}
