package typings.umtrackWx.mod.UMA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitParams extends js.Object {
  /**
    * @description
    * APP_KEY distributed by the Umeng<https://www.umeng.com/>
    */
  var appKey: String
  /**
    * @description If you need to get openid from the Umeng backend, please go to the Umeng backend to set the miniprogram's appId and secret
    */
  var autoGetOpenid: js.UndefOr[Boolean] = js.undefined
  /**
    * @description debug mode
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * @description
    * Whether or not to use openid for statistics, if this is false, the user statistics will be used by "Umeng" + random ID
    */
  var useOpenid: js.UndefOr[Boolean] = js.undefined
}

object InitParams {
  @scala.inline
  def apply(
    appKey: String,
    autoGetOpenid: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    useOpenid: js.UndefOr[Boolean] = js.undefined
  ): InitParams = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGetOpenid)) __obj.updateDynamic("autoGetOpenid")(autoGetOpenid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useOpenid)) __obj.updateDynamic("useOpenid")(useOpenid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
}

