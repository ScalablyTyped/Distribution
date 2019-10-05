package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.downloadFile")
@js.native
object downloadFile extends js.Object {
  /**
  	 * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
  	 * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
  	 */
  def apply(options: DownloadFileOptions): DownloadTask = js.native
}

