package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadFileOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 要上传文件资源的路径 */
  var filePath: java.lang.String
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: java.lang.String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  /** 开发者服务器 url */
  var url: java.lang.String
}

