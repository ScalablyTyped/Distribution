package typings.winrt.Windows.Security.Credentials.UI

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden
import typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected
import typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CredentialSaveOption extends js.Object

@JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
@js.native
object CredentialSaveOption extends js.Object {
  @js.native
  sealed trait hidden extends CredentialSaveOption
  
  @js.native
  sealed trait selected extends CredentialSaveOption
  
  @js.native
  sealed trait unselected extends CredentialSaveOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CredentialSaveOption with Double] = js.native
  /* 2 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 1 */ @js.native
  object selected extends TopLevel[selected with Double]
  
  /* 0 */ @js.native
  object unselected extends TopLevel[unselected with Double]
  
}

