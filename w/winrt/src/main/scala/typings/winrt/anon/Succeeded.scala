package typings.winrt.anon

import typings.winrt.Windows.Data.Json.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Succeeded extends js.Object {
  var result: JsonObject
  var succeeded: Boolean
}

object Succeeded {
  @scala.inline
  def apply(result: JsonObject, succeeded: Boolean): Succeeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Succeeded]
  }
}

