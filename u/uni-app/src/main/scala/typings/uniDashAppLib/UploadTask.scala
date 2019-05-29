package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTask extends js.Object {
  /**
    * 中断上传任务
    */
  def abort(): scala.Unit = js.native
  /**
    * 监听上传进度变化
    */
  def onProgressUpdate(): scala.Unit = js.native
  def onProgressUpdate(callback: js.Function1[/* result */ OnProgressUpdateResult, scala.Unit]): scala.Unit = js.native
}

