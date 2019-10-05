package typings.wegameDashApi.wx

import typings.wegameDashApi.DownloadTask
import typings.wegameDashApi.wx.types.DownfileParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.downloadFile")
@js.native
object downloadFile extends js.Object {
  // --网络
  /**
    * 下载文件
    */
  def apply(param: DownfileParams): DownloadTask = js.native
}

