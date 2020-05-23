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
  
}

