package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardUserSettings extends js.Object {
  var autoRefreshState: scala.Boolean
}

object BoardUserSettings {
  @scala.inline
  def apply(autoRefreshState: scala.Boolean): BoardUserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoRefreshState")(autoRefreshState)
    __obj.asInstanceOf[BoardUserSettings]
  }
}

