package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.CommonParamscallbackLogin
  - typings.trezorConnect.mod.LoginChallenge
*/
trait RequestLoginParams extends js.Object
object RequestLoginParams {
  
  @scala.inline
  def CommonParamscallbackLogin(callback: () => LoginChallenge): RequestLoginParams = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    __obj.asInstanceOf[RequestLoginParams]
  }
  
  @scala.inline
  def LoginChallenge(challengeHidden: String, challengeVisual: String): RequestLoginParams = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLoginParams]
  }
}
