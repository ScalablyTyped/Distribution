package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManager extends js.Object {
  /**
    * 应用更新包并重启
    */
  def applyUpdate(): Unit
  /**
    * 监听检查更新结果回调
    */
  def onCheckForUpdate(callback: js.Function0[Unit]): Unit
  /**
    * 监听更新包下载失败回调
    */
  def onUpdateFailed(callback: js.Function0[Unit]): Unit
  /**
    * 监听更新包下载成功回调
    */
  def onUpdateReady(callback: js.Function0[Unit]): Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function0[Unit] => Unit,
    onUpdateFailed: js.Function0[Unit] => Unit,
    onUpdateReady: js.Function0[Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
}

