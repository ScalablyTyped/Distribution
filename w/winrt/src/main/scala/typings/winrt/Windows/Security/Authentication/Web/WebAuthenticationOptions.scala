package typings.winrt.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.none
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object silentMode extends TopLevel[silentMode with Double]
  
  /* 4 */ @js.native
  object useCorporateNetwork extends TopLevel[useCorporateNetwork with Double]
  
  /* 3 */ @js.native
  object useHttpPost extends TopLevel[useHttpPost with Double]
  
  /* 2 */ @js.native
  object useTitle extends TopLevel[useTitle with Double]
  
}

