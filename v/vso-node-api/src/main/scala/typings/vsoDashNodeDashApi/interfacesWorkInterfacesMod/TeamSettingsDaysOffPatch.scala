package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsDaysOffPatch extends js.Object {
  var daysOff: js.Array[DateRange]
}

object TeamSettingsDaysOffPatch {
  @scala.inline
  def apply(daysOff: js.Array[DateRange]): TeamSettingsDaysOffPatch = {
    val __obj = js.Dynamic.literal(daysOff = daysOff.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamSettingsDaysOffPatch]
  }
}

