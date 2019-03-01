package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastSystem extends js.Object {
  var value: java.lang.String
  var version: java.lang.String | scala.Null
}

object VastSystem {
  @scala.inline
  def apply(value: java.lang.String, version: java.lang.String = null): VastSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[VastSystem]
  }
}

