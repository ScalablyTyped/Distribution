package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManager extends js.Object {
  /**
    * 当新版本下载完成，调用该方法会强制当前uni-app应用上新版本并重启
    */
  def applyUpdate(): scala.Unit = js.native
  /**
    * 当向应用后台请求完新版本信息，会进行回调
    */
  def onCheckForUpdate(): scala.Unit = js.native
  def onCheckForUpdate(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 当新版本下载失败，会进行回调
    */
  def onUpdateFailed(): scala.Unit = js.native
  def onUpdateFailed(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 当新版本下载完成，会进行回调
    */
  def onUpdateReady(): scala.Unit = js.native
  def onUpdateReady(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

