package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.uploadFile")
@js.native
object uploadFile extends js.Object {
  /**
  	 * 将本地资源上传到开发者服务器。
  	 * 如页面通过 wx.chooseImage 等接口获取到一个本地资源的临时文件路径后，
  	 * 可通过此接口将本地资源上传到指定服务器。
  	 * 客户端发起一个 HTTPS POST 请求，
  	 * 其中 Content-Type 为 multipart/form-data 。
  	 */
  def apply(options: UploadFileOptions): UploadTask = js.native
}

