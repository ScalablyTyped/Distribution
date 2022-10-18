package typings.twilio

import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJwtTaskrouterUtilMod {
  
  @JSImport("twilio/lib/jwt/taskrouter/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def activitiesUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("activitiesUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def activitiesUrl(workspaceSid: String, activitySid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("activitiesUrl")(workspaceSid.asInstanceOf[js.Any], activitySid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def defaultEventBridgePolicies(accountSid: String, channelId: String): js.Array[Policy] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEventBridgePolicies")(accountSid.asInstanceOf[js.Any], channelId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Policy]]
  
  inline def defaultWorkerPolicies(version: String, workspaceSid: String, workerSid: String): js.Array[Policy] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultWorkerPolicies")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Policy]]
  
  inline def reservationsUrl(workspaceSid: String, workerSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reservationsUrl")(workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reservationsUrl(workspaceSid: String, workerSid: String, reservationSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reservationsUrl")(workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any], reservationSid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def taskQueuesUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("taskQueuesUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def taskQueuesUrl(workspaceSid: String, taskQueueSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("taskQueuesUrl")(workspaceSid.asInstanceOf[js.Any], taskQueueSid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tasksUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tasksUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def tasksUrl(workspaceSid: String, taskSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tasksUrl")(workspaceSid.asInstanceOf[js.Any], taskSid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def workersUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("workersUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def workersUrl(workspaceSid: String, workerSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("workersUrl")(workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def workspacesUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("workspacesUrl")().asInstanceOf[String]
  inline def workspacesUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("workspacesUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
}
