package typings.winrt.anon

import typings.winrt.Windows.Data.Json.JsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var result: JsonValue
  var succeeded: Boolean
}

object Result {
  @scala.inline
  def apply(result: JsonValue, succeeded: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

