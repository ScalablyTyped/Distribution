package typings.tizenTvWebapis.ssoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SsoLoginState extends js.Object
@JSImport("tizen-tv-webapis/sso", "SsoLoginState")
@js.native
object SsoLoginState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsoLoginState with Double] = js.native
  
  /**
    * Logged in
    */
  @js.native
  sealed trait SSO_LOGIN extends SsoLoginState
  /* 1 */ @js.native
  object SSO_LOGIN extends TopLevel[SSO_LOGIN with Double]
  
  /**
    * Not logged in
    */
  @js.native
  sealed trait SSO_NOT_LOGIN extends SsoLoginState
  /* 0 */ @js.native
  object SSO_NOT_LOGIN extends TopLevel[SSO_NOT_LOGIN with Double]
}
