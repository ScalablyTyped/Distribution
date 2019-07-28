package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "TaskRouterClient")
@js.native
class TaskRouterClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, workspaceSid: String) = this()
  def this(sid: String, tkn: String, workspaceSid: String, options: ClientOptions) = this()
  var workspace: WorkspaceResource = js.native
  var workspaces: WorkspaceResource = js.native
}

