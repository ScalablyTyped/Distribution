package typings.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CredentialPromptType extends js.Object

@JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
@js.native
object CredentialPromptType extends js.Object {
  @js.native
  sealed trait doNotPrompt extends CredentialPromptType
  
  @js.native
  sealed trait promptIfNeeded extends CredentialPromptType
  
  @js.native
  sealed trait retypeCredentials extends CredentialPromptType
  
  /* 2 */ val doNotPrompt: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt with Double = js.native
  /* 0 */ val promptIfNeeded: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded with Double = js.native
  /* 1 */ val retypeCredentials: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CredentialPromptType with Double] = js.native
}

