package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
trait NewUserInfoParam extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.en | wegameDashApiLib.wegameDashApiLibStrings.zh_CN | wegameDashApiLib.wegameDashApiLibStrings.zh_TW
  ] = js.undefined
  /**
    * 要获取信息的用户的 openId 数组，如果要获取当前用户信息，则将数组中的一个元素设为 'selfOpenId'
    */
  var openIdList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_DataArray, scala.Unit]] = js.undefined
}

object NewUserInfoParam {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    lang: wegameDashApiLib.wegameDashApiLibStrings.en | wegameDashApiLib.wegameDashApiLibStrings.zh_CN | wegameDashApiLib.wegameDashApiLibStrings.zh_TW = null,
    openIdList: js.Array[java.lang.String] = null,
    success: /* res */ wegameDashApiLib.Anon_DataArray => scala.Unit = null
  ): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (openIdList != null) __obj.updateDynamic("openIdList")(openIdList)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NewUserInfoParam]
  }
}

