package typings.twilio.accessTokenMod

import typings.twilio.twilioStrings.task_router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "TaskRouterGrant")
@js.native
open class TaskRouterGrant ()
  extends Grant[TaskRouterGrantOptions, TaskRouterGrantPayload, task_router]
     with TaskRouterGrantOptions {
  def this(opts: TaskRouterGrantOptions) = this()
}
