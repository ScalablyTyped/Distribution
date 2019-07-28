package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastSystem extends js.Object {
  var value: String
  var version: String | Null
}

object VastSystem {
  @scala.inline
  def apply(value: String, version: String = null): VastSystem = {
    val __obj = js.Dynamic.literal(value = value)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[VastSystem]
  }
}

