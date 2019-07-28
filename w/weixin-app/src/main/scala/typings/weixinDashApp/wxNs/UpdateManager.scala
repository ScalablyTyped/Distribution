package typings.weixinDashApp.wxNs

import typings.weixinDashApp.Anon_ErrMsg
import typings.weixinDashApp.Anon_HasUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManager extends js.Object {
  /**
  		 * 强制小程序重启并使用新版本。在小程序新版本下载完成后（即收到 `onUpdateReady` 回调）调用。
  		 */
  def applyUpdate(): Unit
  /**
  		 * 监听向微信后台请求检查更新结果事件。微信在小程序冷启动时自动检查更新，不需由开发者主动触发。
  		 */
  def onCheckForUpdate(/** 向微信后台请求检查更新结果事件的回调函数 */
  callback: js.Function1[/* result */ Anon_HasUpdate, Unit]): Unit
  /** 监听小程序更新失败事件。小程序有新版本，客户端主动触发下载（无需开发者触发），下载失败（可能是网络原因等）后回调 */
  def onUpdateFailed(/** 小程序更新失败事件的回调函数 */
  callback: js.Function1[/* res */ Anon_ErrMsg, Unit]): Unit
  /** 监听小程序有版本更新事件。客户端主动触发下载（无需开发者触发），下载成功后回调 */
  def onUpdateReady(/** 小程序有版本更新事件的回调函数 */
  callback: js.Function0[Unit]): Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function1[/* result */ Anon_HasUpdate, Unit] => Unit,
    onUpdateFailed: js.Function1[/* res */ Anon_ErrMsg, Unit] => Unit,
    onUpdateReady: js.Function0[Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
  
    __obj.asInstanceOf[UpdateManager]
  }
}

