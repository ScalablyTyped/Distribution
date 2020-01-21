package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatusCode extends js.Object {
  var statusCode: Double
  var tempFilePath: js.UndefOr[String] = js.undefined
}

object AnonStatusCode {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String = null): AnonStatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatusCode]
  }
}

