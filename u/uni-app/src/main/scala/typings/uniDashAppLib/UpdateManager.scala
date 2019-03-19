package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateManager extends js.Object {
  /**
    * 当新版本下载完成，调用该方法会强制当前uni-app应用上新版本并重启
    */
  def applyUpdate(): scala.Unit
  /**
    * 当向应用后台请求完新版本信息，会进行回调
    */
  def onCheckForUpdate(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 当新版本下载失败，会进行回调
    */
  def onUpdateFailed(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 当新版本下载完成，会进行回调
    */
  def onUpdateReady(callback: js.Function0[scala.Unit]): scala.Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => scala.Unit,
    onCheckForUpdate: js.Function0[scala.Unit] => scala.Unit,
    onUpdateFailed: js.Function0[scala.Unit] => scala.Unit,
    onUpdateReady: js.Function0[scala.Unit] => scala.Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
  
    __obj.asInstanceOf[UpdateManager]
  }
}

