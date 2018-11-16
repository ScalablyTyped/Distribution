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

