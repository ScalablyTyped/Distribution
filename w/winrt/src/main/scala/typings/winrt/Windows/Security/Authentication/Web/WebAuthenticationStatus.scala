package typings.winrt.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.errorHttp
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.success
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.userCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationStatus extends js.Object

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
@js.native
object WebAuthenticationStatus extends js.Object {
  @js.native
  sealed trait errorHttp extends WebAuthenticationStatus
  
  @js.native
  sealed trait success extends WebAuthenticationStatus
  
  @js.native
  sealed trait userCancel extends WebAuthenticationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationStatus with Double] = js.native
  /* 2 */ @js.native
  object errorHttp extends TopLevel[errorHttp with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 1 */ @js.native
  object userCancel extends TopLevel[userCancel with Double]
  
}

