package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("LoadSubpackageTask")
@js.native
class LoadSubpackageTask () extends js.Object {
  /**
    * 监听分包加载进度变化事件
    * @param callback.res.progress 分包下载进度百分比
    * @param callback.res.totalBytesWritten 已经下载的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ Anon_Progress, Unit]): Unit = js.native
}

