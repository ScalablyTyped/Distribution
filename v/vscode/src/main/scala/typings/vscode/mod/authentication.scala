package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.AuthenticationGetSessionO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "authentication")
@js.native
object authentication extends js.Object {
  
  def getSession(providerId: String, scopes: js.Array[String]): Thenable[js.UndefOr[AuthenticationSession]] = js.native
  def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionO): Thenable[AuthenticationSession] = js.native
  def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionOptions): Thenable[js.UndefOr[AuthenticationSession]] = js.native
  
  val onDidChangeSessions: Event[AuthenticationSessionsChangeEvent] = js.native
}
