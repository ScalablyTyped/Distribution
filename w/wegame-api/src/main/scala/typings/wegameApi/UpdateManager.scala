package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UpdateManager")
@js.native
class UpdateManager () extends js.Object {
  /**
    * 应用更新包并重启
    */
  def applyUpdate(): Unit = js.native
  /**
    * 监听检查更新结果回调
    */
  def onCheckForUpdate(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听更新包下载失败回调
    */
  def onUpdateFailed(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听更新包下载成功回调
    */
  def onUpdateReady(callback: js.Function0[Unit]): Unit = js.native
}

