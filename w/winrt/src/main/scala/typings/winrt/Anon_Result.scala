package typings.winrt

import typings.winrt.WindowsNs.DataNs.JsonNs.JsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  var result: JsonArray
  var succeeded: Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: JsonArray, succeeded: Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal(result = result, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_Result]
  }
}

