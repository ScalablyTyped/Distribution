package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOptionFiles extends js.Object {
  /**
    * multipart 提交时，表单的项目名，默认为 file，如果 name 不填或填的值相同，可能导致服务端读取文件时只能读取到一个文件。
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 要上传文件资源的路径
    */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object UploadFileOptionFiles {
  @scala.inline
  def apply(name: java.lang.String = null, uri: java.lang.String = null): UploadFileOptionFiles = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[UploadFileOptionFiles]
  }
}

