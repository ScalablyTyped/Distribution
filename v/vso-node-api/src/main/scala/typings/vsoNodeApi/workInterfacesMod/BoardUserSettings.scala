package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardUserSettings extends js.Object {
  var autoRefreshState: Boolean
}

object BoardUserSettings {
  @scala.inline
  def apply(autoRefreshState: Boolean): BoardUserSettings = {
    val __obj = js.Dynamic.literal(autoRefreshState = autoRefreshState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardUserSettings]
  }
}

