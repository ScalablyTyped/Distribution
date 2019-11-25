package typings.timezonecomplete.distLibLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPeriod extends js.Object {
  var am: String
  var midnight: String
  var noon: String
  var pm: String
}

object DayPeriod {
  @scala.inline
  def apply(am: String, midnight: String, noon: String, pm: String): DayPeriod = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], midnight = midnight.asInstanceOf[js.Any], noon = noon.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DayPeriod]
  }
}

