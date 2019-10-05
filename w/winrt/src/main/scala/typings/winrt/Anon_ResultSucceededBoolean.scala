package typings.winrt

import typings.winrt.Windows.Data.Json.JsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultSucceededBoolean extends js.Object {
  var result: JsonValue
  var succeeded: Boolean
}

object Anon_ResultSucceededBoolean {
  @scala.inline
  def apply(result: JsonValue, succeeded: Boolean): Anon_ResultSucceededBoolean = {
    val __obj = js.Dynamic.literal(result = result, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_ResultSucceededBoolean]
  }
}

