package typings.winrt.Windows.Security.Authentication.OnlineId

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CredentialPromptType with Double] = js.native
  /* 2 */ @js.native
  object doNotPrompt extends TopLevel[doNotPrompt with Double]
  
  /* 0 */ @js.native
  object promptIfNeeded extends TopLevel[promptIfNeeded with Double]
  
  /* 1 */ @js.native
  object retypeCredentials extends TopLevel[retypeCredentials with Double]
  
}

