package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CredentialPromptType extends js.Object

@JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
@js.native
object CredentialPromptType extends js.Object {
  @js.native
  sealed trait doNotPrompt
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType
  
  @js.native
  sealed trait promptIfNeeded
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType
  
  @js.native
  sealed trait retypeCredentials
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType
  
  val doNotPrompt: doNotPrompt with java.lang.String = js.native
  val promptIfNeeded: promptIfNeeded with java.lang.String = js.native
  val retypeCredentials: retypeCredentials with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType with java.lang.String
  ] = js.native
}

