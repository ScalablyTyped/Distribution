package typings.winrt

import typings.winrt.Windows.Data.Json.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSucceeded extends js.Object {
  var result: JsonObject
  var succeeded: Boolean
}

object AnonSucceeded {
  @scala.inline
  def apply(result: JsonObject, succeeded: Boolean): AnonSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSucceeded]
  }
}

