package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RSS or ATOM feed found on the webpage. */
trait Feed extends js.Object {
  /** URL of the RSS or ATOM feed. */
  var link: js.UndefOr[String] = js.undefined
}

object Feed {
  @scala.inline
  def apply(link: String = null): Feed = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Feed]
  }
}

