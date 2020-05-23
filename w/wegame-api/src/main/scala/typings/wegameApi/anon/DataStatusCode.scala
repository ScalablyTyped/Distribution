package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStatusCode extends js.Object {
  var data: String
  var statusCode: Double
}

object DataStatusCode {
  @scala.inline
  def apply(data: String, statusCode: Double): DataStatusCode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStatusCode]
  }
}

