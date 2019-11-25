package typings.weappDashApi.weappDashApiMod.wx

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOptions
  extends /* key */ StringDictionary[js.Any] {
  /** 页面的初始数据 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 生命周期函数--监听页面隐藏 */
  var onHide: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面加载 */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.undefined
  /** 生命周期函数--监听页面渲染完成 */
  var onReady: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面显示 */
  var onShow: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面卸载 */
  var onUnload: js.UndefOr[NoneParamCallback] = js.undefined
}

object PageOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    data: js.Any = null,
    onHide: () => Unit = null,
    onLoad: /* options */ js.Any => Unit = null,
    onReady: () => Unit = null,
    onShow: () => Unit = null,
    onUnload: () => Unit = null
  ): PageOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onUnload != null) __obj.updateDynamic("onUnload")(js.Any.fromFunction0(onUnload))
    __obj.asInstanceOf[PageOptions]
  }
}

