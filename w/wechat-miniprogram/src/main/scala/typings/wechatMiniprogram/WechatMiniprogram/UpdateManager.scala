package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateManager extends js.Object {
  
  /** [UpdateManager.applyUpdate()](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.applyUpdate.html)
    *
    * 强制小程序重启并使用新版本。在小程序新版本下载完成后（即收到 `onUpdateReady` 回调）调用。 */
  def applyUpdate(): Unit = js.native
  
  /** [UpdateManager.onCheckForUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.onCheckForUpdate.html)
    *
    * 监听向微信后台请求检查更新结果事件。微信在小程序冷启动时自动检查更新，不需由开发者主动触发。 */
  def onCheckForUpdate(/** 向微信后台请求检查更新结果事件的回调函数 */
  callback: OnCheckForUpdateCallback): Unit = js.native
  
  /** [UpdateManager.onUpdateFailed(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.onUpdateFailed.html)
    *
    * 监听小程序更新失败事件。小程序有新版本，客户端主动触发下载（无需开发者触发），下载失败（可能是网络原因等）后回调 */
  def onUpdateFailed(/** 小程序更新失败事件的回调函数 */
  callback: OnUpdateFailedCallback): Unit = js.native
  
  /** [UpdateManager.onUpdateReady(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/base/update/UpdateManager.onUpdateReady.html)
    *
    * 监听小程序有版本更新事件。客户端主动触发下载（无需开发者触发），下载成功后回调 */
  def onUpdateReady(/** 小程序有版本更新事件的回调函数 */
  callback: OnUpdateReadyCallback): Unit = js.native
}
object UpdateManager {
  
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: OnCheckForUpdateCallback => Unit,
    onUpdateFailed: OnUpdateFailedCallback => Unit,
    onUpdateReady: OnUpdateReadyCallback => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
  
  @scala.inline
  implicit class UpdateManagerOps[Self <: UpdateManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyUpdate(value: () => Unit): Self = this.set("applyUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCheckForUpdate(value: OnCheckForUpdateCallback => Unit): Self = this.set("onCheckForUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdateFailed(value: OnUpdateFailedCallback => Unit): Self = this.set("onUpdateFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdateReady(value: OnUpdateReadyCallback => Unit): Self = this.set("onUpdateReady", js.Any.fromFunction1(value))
  }
}
