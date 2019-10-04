package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatusCode extends js.Object {
  var statusCode: Double
  var tempFilePath: js.UndefOr[String] = js.undefined
}

object Anon_StatusCode {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String = null): Anon_StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath)
    __obj.asInstanceOf[Anon_StatusCode]
  }
}

