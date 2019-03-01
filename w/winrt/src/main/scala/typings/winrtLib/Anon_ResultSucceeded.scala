package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultSucceeded extends js.Object {
  var result: winrtLib.WindowsNs.DataNs.JsonNs.JsonObject
  var succeeded: scala.Boolean
}

object Anon_ResultSucceeded {
  @scala.inline
  def apply(result: winrtLib.WindowsNs.DataNs.JsonNs.JsonObject, succeeded: scala.Boolean): Anon_ResultSucceeded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[Anon_ResultSucceeded]
  }
}

