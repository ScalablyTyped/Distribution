package typings
package timezonecompleteLib.distLibLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPeriod extends js.Object {
  var am: java.lang.String
  var midnight: java.lang.String
  var noon: java.lang.String
  var pm: java.lang.String
}

object DayPeriod {
  @scala.inline
  def apply(am: java.lang.String, midnight: java.lang.String, noon: java.lang.String, pm: java.lang.String): DayPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("am")(am)
    __obj.updateDynamic("midnight")(midnight)
    __obj.updateDynamic("noon")(noon)
    __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[DayPeriod]
  }
}

