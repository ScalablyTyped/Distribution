package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkQualityConfiguration extends js.Object {
  var local: js.UndefOr[NetworkQualityVerbosity] = js.undefined
  var remote: js.UndefOr[NetworkQualityVerbosity] = js.undefined
}

object NetworkQualityConfiguration {
  @scala.inline
  def apply(local: NetworkQualityVerbosity = null, remote: NetworkQualityVerbosity = null): NetworkQualityConfiguration = {
    val __obj = js.Dynamic.literal()
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkQualityConfiguration]
  }
}

