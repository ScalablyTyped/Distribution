package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of Word conversion settings. */
trait WordSettings extends js.Object {
  var heading: js.UndefOr[WordHeadingDetection] = js.undefined
}

object WordSettings {
  @scala.inline
  def apply(heading: WordHeadingDetection = null): WordSettings = {
    val __obj = js.Dynamic.literal()
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordSettings]
  }
}

