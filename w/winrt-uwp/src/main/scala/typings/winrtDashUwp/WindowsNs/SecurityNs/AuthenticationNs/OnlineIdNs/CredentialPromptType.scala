package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CredentialPromptType extends js.Object

/** Provides the ability to control when to show or hide the credential prompt user interface. This includes the user interface for the app to collect user consent to access data stored in Live. The user must see the user interface in order for the app to obtain any user data, if not app will see an error when they try to obtain user data. */
@JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
@js.native
object CredentialPromptType extends js.Object {
  /** Never show the UI, even if an error occurs. */
  @js.native
  sealed trait doNotPrompt extends CredentialPromptType
  
  /** Show the UI only if an error occurred. */
  @js.native
  sealed trait promptIfNeeded extends CredentialPromptType
  
  /** Always show the UI. If a default username exists, the username is automatically inserted into the appropriate field. */
  @js.native
  sealed trait retypeCredentials extends CredentialPromptType
  
  /* 2 */ val doNotPrompt: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType.doNotPrompt with Double = js.native
  /* 0 */ val promptIfNeeded: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType.promptIfNeeded with Double = js.native
  /* 1 */ val retypeCredentials: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs.CredentialPromptType.retypeCredentials with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CredentialPromptType with Double] = js.native
}

