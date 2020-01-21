package typings.wegameApi.wx

import typings.wegameApi.AnonAdUnitId
import typings.wegameApi.RewardedVideoAd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createRewardedVideoAd")
@js.native
object createRewardedVideoAd extends js.Object {
  /**
    * 创建激励视频广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.0.4 后再使用该 API。同时，开发者工具上暂不支持调试该 API，请直接在真机上进行调试。
    */
  def apply(param: AnonAdUnitId): RewardedVideoAd = js.native
}

