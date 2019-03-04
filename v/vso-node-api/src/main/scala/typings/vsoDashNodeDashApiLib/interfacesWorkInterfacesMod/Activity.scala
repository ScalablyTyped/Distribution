package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var capacityPerDay: scala.Double
  var name: java.lang.String
}

object Activity {
  @scala.inline
  def apply(capacityPerDay: scala.Double, name: java.lang.String): Activity = {
    val __obj = js.Dynamic.literal(capacityPerDay = capacityPerDay, name = name)
  
    __obj.asInstanceOf[Activity]
  }
}

