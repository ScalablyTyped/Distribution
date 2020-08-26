package typings.umtrackWx.mod.UMA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitParams extends js.Object {
  /**
    * @description
    * APP_KEY distributed by the Umeng<https://www.umeng.com/>
    */
  var appKey: String = js.native
  /**
    * @description If you need to get openid from the Umeng backend, please go to the Umeng backend to set the miniprogram's appId and secret
    */
  var autoGetOpenid: js.UndefOr[Boolean] = js.native
  /**
    * @description debug mode
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * @description
    * Whether or not to use openid for statistics, if this is false, the user statistics will be used by "Umeng" + random ID
    */
  var useOpenid: js.UndefOr[Boolean] = js.native
}

object InitParams {
  @scala.inline
  def apply(appKey: String): InitParams = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  @scala.inline
  implicit class InitParamsOps[Self <: InitParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoGetOpenid(value: Boolean): Self = this.set("autoGetOpenid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGetOpenid: Self = this.set("autoGetOpenid", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setUseOpenid(value: Boolean): Self = this.set("useOpenid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseOpenid: Self = this.set("useOpenid", js.undefined)
  }
  
}

