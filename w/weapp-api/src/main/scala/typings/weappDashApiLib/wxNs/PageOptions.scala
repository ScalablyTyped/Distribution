package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** 页面的初始数据 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 生命周期函数--监听页面隐藏 */
  var onHide: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面加载 */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Any, scala.Unit]] = js.undefined
  /** 生命周期函数--监听页面渲染完成 */
  var onReady: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面显示 */
  var onShow: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面卸载 */
  var onUnload: js.UndefOr[NoneParamCallback] = js.undefined
}

