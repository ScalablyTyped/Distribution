package typings.wampy.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorArgs extends js.Object {
  var details: Dict
  var error: String
}

object ErrorArgs {
  @scala.inline
  def apply(details: Dict, error: String): ErrorArgs = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorArgs]
  }
}

