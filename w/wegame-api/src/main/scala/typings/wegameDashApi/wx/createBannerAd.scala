package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_AdUnitIdStyleAdStyle
import typings.wegameDashApi.BannerAd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createBannerAd")
@js.native
object createBannerAd extends js.Object {
  // --广告
  /**
    * 创建 banner 广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号 >= 2.0.4 后再使用该 API。同时，开发者工具上暂不支持调试该 API，请直接在真机上进行调试。
    */
  def apply(param: Anon_AdUnitIdStyleAdStyle): BannerAd = js.native
}

