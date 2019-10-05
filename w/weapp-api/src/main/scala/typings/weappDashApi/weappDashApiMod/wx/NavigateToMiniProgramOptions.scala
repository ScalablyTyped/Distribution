package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToMiniProgramOptions extends CommonCallbackOptions {
  //  要打开的小程序 appId
  var appId: String
  //  要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。
  var envVersion: js.UndefOr[typings.weappDashApi.weappDashApiMod.wx.envVersion] = js.undefined
  //  需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。
  var extraData: js.UndefOr[js.Object] = js.undefined
  //  打开的页面路径，如果为空则打开首页
  var path: js.UndefOr[String] = js.undefined
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(
    appId: String,
    complete: /* res */ js.Any => Unit = null,
    envVersion: envVersion = null,
    extraData: js.Object = null,
    fail: /* res */ js.Any => Unit = null,
    path: String = null,
    success: /* res */ js.Any => Unit = null
  ): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
}

