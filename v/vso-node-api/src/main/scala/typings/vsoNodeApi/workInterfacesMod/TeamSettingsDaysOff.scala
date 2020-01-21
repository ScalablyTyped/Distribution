package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsDaysOff extends TeamSettingsDataContractBase {
  var daysOff: js.Array[DateRange]
}

object TeamSettingsDaysOff {
  @scala.inline
  def apply(_links: js.Any, daysOff: js.Array[DateRange], url: String): TeamSettingsDaysOff = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamSettingsDaysOff]
  }
}

