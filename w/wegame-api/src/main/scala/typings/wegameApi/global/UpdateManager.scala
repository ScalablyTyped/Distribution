package typings.wegameApi.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UpdateManager")
@js.native
class UpdateManager ()
  extends typings.wegameApi.UpdateManager {
  /**
    * 应用更新包并重启
    */
  /* CompleteClass */
  override def applyUpdate(): Unit = js.native
  /**
    * 监听检查更新结果回调
    */
  /* CompleteClass */
  override def onCheckForUpdate(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听更新包下载失败回调
    */
  /* CompleteClass */
  override def onUpdateFailed(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听更新包下载成功回调
    */
  /* CompleteClass */
  override def onUpdateReady(callback: js.Function0[Unit]): Unit = js.native
}

