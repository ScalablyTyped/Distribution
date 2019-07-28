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
    val __obj = js.Dynamic.literal(am = am, midnight = midnight, noon = noon, pm = pm)
  
    __obj.asInstanceOf[DayPeriod]
  }
}

