package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileSuccess extends js.Object {
  var fileID: String
  var statusCode: Double
}

object UploadFileSuccess {
  @scala.inline
  def apply(fileID: String, statusCode: Double): UploadFileSuccess = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadFileSuccess]
  }
}

