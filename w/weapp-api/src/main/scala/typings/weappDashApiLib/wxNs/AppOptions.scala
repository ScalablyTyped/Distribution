package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
           * 生命周期函数--监听小程序隐藏
           * 当小程序从前台进入后台，会触发 onHide
           */
  var onHide: js.UndefOr[NoneParamCallback] = js.undefined
  /**
           * 生命周期函数--监听小程序初始化
           * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
           */
  var onLaunch: js.UndefOr[NoneParamCallback] = js.undefined
  /**
           * 生命周期函数--监听小程序显示
           * 当小程序启动，或从后台进入前台显示，会触发 onShow
           */
  var onShow: js.UndefOr[NoneParamCallback] = js.undefined
}

