package typings.winrt

import typings.winrt.Windows.Data.Json.JsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  var result: JsonArray
  var succeeded: Boolean
}

object AnonResult {
  @scala.inline
  def apply(result: JsonArray, succeeded: Boolean): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult]
  }
}

