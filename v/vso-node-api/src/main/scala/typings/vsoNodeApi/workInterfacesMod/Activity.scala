package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var capacityPerDay: Double
  var name: String
}

object Activity {
  @scala.inline
  def apply(capacityPerDay: Double, name: String): Activity = {
    val __obj = js.Dynamic.literal(capacityPerDay = capacityPerDay.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

