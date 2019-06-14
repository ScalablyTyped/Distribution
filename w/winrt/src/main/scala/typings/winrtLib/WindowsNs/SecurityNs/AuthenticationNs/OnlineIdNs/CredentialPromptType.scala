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
  
  /* 2 */ val doNotPrompt: doNotPrompt with scala.Double = js.native
  /* 0 */ val promptIfNeeded: promptIfNeeded with scala.Double = js.native
  /* 1 */ val retypeCredentials: retypeCredentials with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType with scala.Double
  ] = js.native
}

