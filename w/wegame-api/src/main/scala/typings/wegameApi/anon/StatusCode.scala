package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCode extends js.Object {
  var statusCode: Double
  var tempFilePath: js.UndefOr[String] = js.undefined
}

object StatusCode {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String = null): StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
}

