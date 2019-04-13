package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "TaskRouterClient")
@js.native
class TaskRouterClient () extends Client {
  def this(sid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, workspaceSid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, workspaceSid: java.lang.String, options: ClientOptions) = this()
  var workspace: WorkspaceResource = js.native
  var workspaces: WorkspaceResource = js.native
}

