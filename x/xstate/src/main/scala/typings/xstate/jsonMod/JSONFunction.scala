package typings.xstate.jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFunction extends js.Object {
  @JSName("$function")
  var $function: String
}

object JSONFunction {
  @scala.inline
  def apply($function: String): JSONFunction = {
    val __obj = js.Dynamic.literal($function = $function.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFunction]
  }
}

