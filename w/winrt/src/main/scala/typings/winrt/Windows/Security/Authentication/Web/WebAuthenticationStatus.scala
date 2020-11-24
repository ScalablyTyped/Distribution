package typings.winrt.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
