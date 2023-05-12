package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.task_router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "TaskRouterGrant")
@js.native
/**
  * @param options - ...
  * @param options.workspaceSid - The workspace unique ID
  * @param options.workerSid - The worker unique ID
  * @param options.role - The role of the grant
  */
open class TaskRouterGrant ()
  extends Grant[TaskRouterGrantOptions, TaskRouterGrantPayload, task_router]
     with TaskRouterGrantOptions {
  def this(options: TaskRouterGrantOptions) = this()
}
