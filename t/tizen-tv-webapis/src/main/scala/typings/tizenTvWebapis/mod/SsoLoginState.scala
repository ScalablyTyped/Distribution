package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SsoLoginState extends StObject
@JSImport("tizen-tv-webapis", "SsoLoginState")
@js.native
object SsoLoginState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SsoLoginState & Double] = js.native
  
  /**
    * Logged in
    *
    * @since 2.3
    */
  @js.native
  sealed trait SSO_LOGIN
    extends StObject
       with SsoLoginState
  /* 1 */ val SSO_LOGIN: typings.tizenTvWebapis.mod.SsoLoginState.SSO_LOGIN & Double = js.native
  
  /**
    * Not logged in
    *
    * @since 2.3
    */
  @js.native
  sealed trait SSO_NOT_LOGIN
    extends StObject
       with SsoLoginState
  /* 0 */ val SSO_NOT_LOGIN: typings.tizenTvWebapis.mod.SsoLoginState.SSO_NOT_LOGIN & Double = js.native
}
