package typings.wegameDashApi

import typings.wegameDashApi.wegameDashApiStrings.develop
import typings.wegameDashApi.wegameDashApiStrings.release
import typings.wegameDashApi.wegameDashApiStrings.trial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppId extends js.Object {
  /**
    * 要打开的小程序 appId
    */
  var appId: String
  /**
    * 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。默认值release
    * develop	开发版
    * trial	体验版
    * release	正式版
    */
  var envVersion: js.UndefOr[develop | trial | release] = js.undefined
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。如果跳转的是小游戏，可以在 wx.onShow、wx.getLaunchOptionsSync 中可以获取到这份数据数据。
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
    * 打开的页面路径，如果为空则打开首页。path 中 ? 后面的部分会成为 query，在小程序的 App.onLaunch、App.onShow
    * 和 Page.onLoad 的回调函数或小游戏的 wx.onShow 回调函数、wx.getLaunchOptionsSync 中可以获取到 query 数据。
    * 对于小游戏，可以只传入 query 部分，来实现传参效果，如：传入 "?foo=bar"。
    */
  var path: js.UndefOr[String] = js.undefined
}

object Anon_AppId {
  @scala.inline
  def apply(
    appId: String,
    envVersion: develop | trial | release = null,
    extraData: js.Any = null,
    path: String = null
  ): Anon_AppId = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_AppId]
  }
}

