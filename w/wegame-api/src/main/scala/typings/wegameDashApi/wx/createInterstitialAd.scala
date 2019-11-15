package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_AdUnitId
import typings.wegameDashApi.InterstitialAd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createInterstitialAd")
@js.native
object createInterstitialAd extends js.Object {
  /**
    * 创建插屏广告组件。请通过 wx.getSystemInfoSync() 返回对象的 SDKVersion 判断基础库版本号后再使用该 API。每次调用该方法创建插屏广告都会返回一个全新的实例（小程序端的插屏广告实例不允许跨页面使用）。
    */
  def apply(param: Anon_AdUnitId): InterstitialAd = js.native
}

