package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadTask extends js.Object {
  /**
    * 中断下载任务
    */
  def abort(): scala.Unit
  /**
    * 监听下载进度变化
    */
  def onProgressUpdate(callback: js.Function1[/* result */ OnProgressDownloadResult, scala.Unit]): scala.Unit
}

object DownloadTask {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    onProgressUpdate: js.Function1[/* result */ OnProgressDownloadResult, scala.Unit] => scala.Unit
  ): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
  
    __obj.asInstanceOf[DownloadTask]
  }
}

