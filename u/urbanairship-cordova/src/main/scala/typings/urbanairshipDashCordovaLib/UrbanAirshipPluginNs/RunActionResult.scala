package typings
package urbanairshipDashCordovaLib.UrbanAirshipPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of the runAction() call.
  */
trait RunActionResult extends js.Object {
  var error: java.lang.String
  var value: js.Any
}

object RunActionResult {
  @scala.inline
  def apply(error: java.lang.String, value: js.Any): RunActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RunActionResult]
  }
}

