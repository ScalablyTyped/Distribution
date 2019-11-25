package typings.urbanairshipDashCordova.UrbanAirshipPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of the runAction() call.
  */
trait RunActionResult extends js.Object {
  var error: String
  var value: js.Any
}

object RunActionResult {
  @scala.inline
  def apply(error: String, value: js.Any): RunActionResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunActionResult]
  }
}

