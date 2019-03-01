package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  var result: winrtLib.WindowsNs.DataNs.JsonNs.JsonArray
  var succeeded: scala.Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: winrtLib.WindowsNs.DataNs.JsonNs.JsonArray, succeeded: scala.Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[Anon_Result]
  }
}

