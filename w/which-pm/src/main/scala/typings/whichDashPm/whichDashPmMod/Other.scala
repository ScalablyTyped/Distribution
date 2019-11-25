package typings.whichDashPm.whichDashPmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends Result {
  val name: String
  val version: js.UndefOr[String] = js.undefined
}

object Other {
  @scala.inline
  def apply(name: String, version: String = null): Other = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
}

