package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsDaysOff extends TeamSettingsDataContractBase {
  var daysOff: js.Array[DateRange]
}

object TeamSettingsDaysOff {
  @scala.inline
  def apply(_links: js.Any, daysOff: js.Array[DateRange], url: java.lang.String): TeamSettingsDaysOff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("daysOff")(daysOff)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TeamSettingsDaysOff]
  }
}

