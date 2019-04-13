package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorArgs extends js.Object {
  var details: Dict
  var error: java.lang.String
}

object ErrorArgs {
  @scala.inline
  def apply(details: Dict, error: java.lang.String): ErrorArgs = {
    val __obj = js.Dynamic.literal(details = details, error = error)
  
    __obj.asInstanceOf[ErrorArgs]
  }
}

