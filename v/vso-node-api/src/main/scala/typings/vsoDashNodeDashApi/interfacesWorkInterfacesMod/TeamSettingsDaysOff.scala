package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsDaysOff extends TeamSettingsDataContractBase {
  var daysOff: js.Array[DateRange]
}

object TeamSettingsDaysOff {
  @scala.inline
  def apply(_links: js.Any, daysOff: js.Array[DateRange], url: String): TeamSettingsDaysOff = {
    val __obj = js.Dynamic.literal(_links = _links, daysOff = daysOff, url = url)
  
    __obj.asInstanceOf[TeamSettingsDaysOff]
  }
}

