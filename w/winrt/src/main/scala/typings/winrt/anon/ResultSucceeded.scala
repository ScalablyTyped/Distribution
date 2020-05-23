package typings.winrt.anon

import typings.winrt.Windows.Data.Json.JsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSucceeded extends js.Object {
  var result: JsonArray
  var succeeded: Boolean
}

object ResultSucceeded {
  @scala.inline
  def apply(result: JsonArray, succeeded: Boolean): ResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSucceeded]
  }
}

