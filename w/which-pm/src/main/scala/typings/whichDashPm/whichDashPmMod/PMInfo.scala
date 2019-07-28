package typings.whichDashPm.whichDashPmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PMInfo extends js.Object {
  var name: String
  var version: js.UndefOr[String] = js.undefined
}

object PMInfo {
  @scala.inline
  def apply(name: String, version: String = null): PMInfo = {
    val __obj = js.Dynamic.literal(name = name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PMInfo]
  }
}

