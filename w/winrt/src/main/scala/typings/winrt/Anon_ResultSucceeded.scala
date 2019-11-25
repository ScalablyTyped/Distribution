package typings.winrt

import typings.winrt.Windows.Data.Json.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultSucceeded extends js.Object {
  var result: JsonObject
  var succeeded: Boolean
}

object Anon_ResultSucceeded {
  @scala.inline
  def apply(result: JsonObject, succeeded: Boolean): Anon_ResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ResultSucceeded]
  }
}

