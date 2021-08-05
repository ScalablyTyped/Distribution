package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.CommonParamscallbackLogin
  - typings.trezorConnect.mod.LoginChallenge
*/
trait RequestLoginParams extends StObject
object RequestLoginParams {
  
  inline def CommonParamscallbackLogin(callback: () => LoginChallenge): typings.trezorConnect.anon.CommonParamscallbackLogin = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    __obj.asInstanceOf[typings.trezorConnect.anon.CommonParamscallbackLogin]
  }
  
  inline def LoginChallenge(challengeHidden: String, challengeVisual: String): typings.trezorConnect.mod.LoginChallenge = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.LoginChallenge]
  }
}
