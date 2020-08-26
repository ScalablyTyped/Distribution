package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManager extends js.Object {
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
    def setOnCheckForUpdate(value: js.Function0[Unit] => Unit): Self = this.set("onCheckForUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUpdateFailed(value: js.Function0[Unit] => Unit): Self = this.set("onUpdateFailed", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUpdateReady(value: js.Function0[Unit] => Unit): Self = this.set("onUpdateReady", js.Any.fromFunction1(value))
  }
  
}

