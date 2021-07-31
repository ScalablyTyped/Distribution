package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "TaskRouterClient")
@js.native
class TaskRouterClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: Unit, tkn: String) = this()
  def this(sid: String, tkn: String, workspaceSid: String) = this()
  def this(sid: String, tkn: Unit, workspaceSid: String) = this()
  def this(sid: Unit, tkn: String, workspaceSid: String) = this()
  def this(sid: Unit, tkn: Unit, workspaceSid: String) = this()
  def this(sid: String, tkn: String, workspaceSid: String, options: ClientOptions) = this()
  def this(sid: String, tkn: String, workspaceSid: Unit, options: ClientOptions) = this()
  def this(sid: String, tkn: Unit, workspaceSid: String, options: ClientOptions) = this()
  def this(sid: String, tkn: Unit, workspaceSid: Unit, options: ClientOptions) = this()
  def this(sid: Unit, tkn: String, workspaceSid: String, options: ClientOptions) = this()
  def this(sid: Unit, tkn: String, workspaceSid: Unit, options: ClientOptions) = this()
  def this(sid: Unit, tkn: Unit, workspaceSid: String, options: ClientOptions) = this()
  def this(sid: Unit, tkn: Unit, workspaceSid: Unit, options: ClientOptions) = this()
  
  var workspace: WorkspaceResource = js.native
  
  var workspaces: WorkspaceResource = js.native
}
