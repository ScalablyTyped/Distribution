package typings
package whichDashPmLib.whichDashPmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PMInfo extends js.Object {
  var name: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object PMInfo {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String = null): PMInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PMInfo]
  }
}

