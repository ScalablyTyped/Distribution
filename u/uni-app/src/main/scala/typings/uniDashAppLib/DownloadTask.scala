package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadTask extends js.Object {
  /**
    * 中断下载任务
    */
  def abort(): scala.Unit = js.native
  /**
    * 监听下载进度变化
    */
  def onProgressUpdate(): scala.Unit = js.native
  def onProgressUpdate(callback: js.Function1[/* result */ OnProgressDownloadResult, scala.Unit]): scala.Unit = js.native
}

