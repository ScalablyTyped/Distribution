package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTask extends js.Object {
  /**
    * 中断上传任务
    */
  def abort(): scala.Unit
  /**
    * 监听上传进度变化
    */
  def onProgressUpdate(callback: js.Function1[/* result */ OnProgressUpdateResult, scala.Unit]): scala.Unit
}

object UploadTask {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    onProgressUpdate: js.Function1[/* result */ OnProgressUpdateResult, scala.Unit] => scala.Unit
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
  
    __obj.asInstanceOf[UploadTask]
  }
}

