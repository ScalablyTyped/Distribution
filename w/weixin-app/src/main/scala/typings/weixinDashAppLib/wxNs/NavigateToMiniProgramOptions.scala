package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var appId: java.lang.String
   // 包括 encrypt_card_id, outer_str, biz三个字段，须从 step3 中获得的链接中获取参数
  var envVersion: js.UndefOr[java.lang.String] = js.undefined
   // 打开的页面路径，如果为空则打开首页
  var extraData: js.UndefOr[js.Any] = js.undefined
   // 要打开的小程序 appId
  var path: js.UndefOr[java.lang.String] = js.undefined
   // 要打开的小程序版本，有效值 develop（开发版），trial（体验版），release（正式版） ，仅在当前小程序为开发版或体验版时此参数有效；如果当前小程序是体验版或正式版，则打开的小程序必定是正式版。默认值 release
  @JSName("success")
  var success_NavigateToMiniProgramOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_ErrMsg, scala.Unit]] = js.undefined
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(
    appId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    envVersion: java.lang.String = null,
    extraData: js.Any = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    path: java.lang.String = null,
    success: js.Function1[/* res */ weixinDashAppLib.Anon_ErrMsg, scala.Unit] = null
  ): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
}

