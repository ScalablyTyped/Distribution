package typings.wegameApi.wx.types

import typings.wegameApi.AnonDataReadonlyArray
import typings.wegameApi.wegameApiStrings.en
import typings.wegameApi.wegameApiStrings.zh_CN
import typings.wegameApi.wegameApiStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
trait NewUserInfoParam extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  /**
    * 要获取信息的用户的 openId 数组，如果要获取当前用户信息，则将数组中的一个元素设为 'selfOpenId'
    */
  var openIdList: js.UndefOr[js.Array[String]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonDataReadonlyArray, Unit]] = js.undefined
}

object NewUserInfoParam {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    lang: en | zh_CN | zh_TW = null,
    openIdList: js.Array[String] = null,
    success: /* res */ AnonDataReadonlyArray => Unit = null
  ): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (openIdList != null) __obj.updateDynamic("openIdList")(openIdList.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NewUserInfoParam]
  }
}

