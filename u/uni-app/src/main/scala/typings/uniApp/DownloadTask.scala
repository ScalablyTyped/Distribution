package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadTask extends js.Object {
  
  /**
    * 中断下载任务
    */
  def abort(): Unit = js.native
  
  /**
    * 监听下载进度变化
    */
  def onProgressUpdate(): Unit = js.native
  def onProgressUpdate(callback: js.Function1[/* result */ OnProgressDownloadResult, Unit]): Unit = js.native
}
