package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseSettings extends js.Object {
  var retentionSettings: RetentionSettings
}

object ReleaseSettings {
  @scala.inline
  def apply(retentionSettings: RetentionSettings): ReleaseSettings = {
    val __obj = js.Dynamic.literal(retentionSettings = retentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSettings]
  }
}

