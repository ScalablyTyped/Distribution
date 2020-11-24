package typings.winrt.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAuthenticationOptions extends js.Object
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
@js.native
object WebAuthenticationOptions extends js.Object {
  
  @js.native
  sealed trait none extends WebAuthenticationOptions
  
  @js.native
  sealed trait silentMode extends WebAuthenticationOptions
  
  @js.native
  sealed trait useCorporateNetwork extends WebAuthenticationOptions
  
  @js.native
  sealed trait useHttpPost extends WebAuthenticationOptions
  
  @js.native
  sealed trait useTitle extends WebAuthenticationOptions
}
