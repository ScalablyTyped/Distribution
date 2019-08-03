package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileSuccess extends js.Object {
  var fileContent: Buffer
  var statusCode: Double
}

object DownloadFileSuccess {
  @scala.inline
  def apply(fileContent: Buffer, statusCode: Double): DownloadFileSuccess = {
    val __obj = js.Dynamic.literal(fileContent = fileContent, statusCode = statusCode)
  
    __obj.asInstanceOf[DownloadFileSuccess]
  }
}

