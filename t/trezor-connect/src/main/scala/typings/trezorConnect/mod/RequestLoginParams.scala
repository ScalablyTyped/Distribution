package typings.trezorConnect.mod

import typings.trezorConnect.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.CommonParamscallbackLogin
  - typings.trezorConnect.mod.LoginChallenge
*/
trait RequestLoginParams extends js.Object

object RequestLoginParams {
  @scala.inline
  def CommonParamscallbackLogin(
    callback: () => LoginChallenge,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: AnonInstance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): RequestLoginParams = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLoginParams]
  }
  @scala.inline
  def LoginChallenge(challengeHidden: String, challengeVisual: String): RequestLoginParams = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestLoginParams]
  }
}

