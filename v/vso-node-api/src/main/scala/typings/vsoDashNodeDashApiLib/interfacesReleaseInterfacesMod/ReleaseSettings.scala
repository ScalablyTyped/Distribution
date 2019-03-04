package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseSettings extends js.Object {
  var retentionSettings: RetentionSettings
}

object ReleaseSettings {
  @scala.inline
  def apply(retentionSettings: RetentionSettings): ReleaseSettings = {
    val __obj = js.Dynamic.literal(retentionSettings = retentionSettings)
  
    __obj.asInstanceOf[ReleaseSettings]
  }
}

