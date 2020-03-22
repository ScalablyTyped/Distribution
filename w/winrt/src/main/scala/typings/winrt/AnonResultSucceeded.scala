package typings.winrt

import typings.winrt.Windows.Data.Json.JsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultSucceeded extends js.Object {
  var result: JsonValue
  var succeeded: Boolean
}

object AnonResultSucceeded {
  @scala.inline
  def apply(result: JsonValue, succeeded: Boolean): AnonResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResultSucceeded]
  }
}

