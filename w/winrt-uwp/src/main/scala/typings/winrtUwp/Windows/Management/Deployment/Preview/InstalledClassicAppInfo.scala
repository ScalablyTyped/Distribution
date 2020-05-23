package typings.winrtUwp.Windows.Management.Deployment.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledClassicAppInfo extends js.Object {
  var displayName: js.Any
   /* unmapped type */ var displayVersion: js.Any
}

object InstalledClassicAppInfo {
  @scala.inline
  def apply(displayName: js.Any, displayVersion: js.Any): InstalledClassicAppInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayVersion = displayVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledClassicAppInfo]
  }
}

