package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.develop
import typings.wegameApi.wegameApiStrings.release
import typings.wegameApi.wegameApiStrings.trial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  appId  :string,   path ? :string,   extraData ? :unknown,   envVersion ? :'develop' | 'trial' | 'release'} & wegame-api.wx.types.Callbacks */
trait appIdstringpathstringextr extends js.Object {
  /**
    * 要打开的小程序 appId
    */
  var appId: String
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。默认值release
    * develop    开发版
    * trial    体验版
    * release    正式版
    */
  var envVersion: js.UndefOr[develop | trial | release] = js.undefined
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。如果跳转的是小游戏，可以在 wx.onShow、wx.getLaunchOptionsSync 中可以获取到这份数据数据。
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 打开的页面路径，如果为空则打开首页。path 中 ? 后面的部分会成为 query，在小程序的 App.onLaunch、App.onShow
    * 和 Page.onLoad 的回调函数或小游戏的 wx.onShow 回调函数、wx.getLaunchOptionsSync 中可以获取到 query 数据。
    * 对于小游戏，可以只传入 query 部分，来实现传参效果，如：传入 "?foo=bar"。
    */
  var path: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object appIdstringpathstringextr {
  @scala.inline
  def apply(
    appId: String,
    complete: () => Unit = null,
    envVersion: develop | trial | release = null,
    extraData: js.Any = null,
    fail: () => Unit = null,
    path: String = null,
    success: () => Unit = null
  ): appIdstringpathstringextr = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[appIdstringpathstringextr]
  }
}

