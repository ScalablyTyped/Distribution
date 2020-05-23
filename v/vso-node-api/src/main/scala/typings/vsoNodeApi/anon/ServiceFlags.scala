package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceFlags extends js.Object {
  var disabled: scala.Double
  var none: scala.Double
  var serviceFlags: scala.Double
  var unChanged: scala.Double
  var verified: scala.Double
}

object ServiceFlags {
  @scala.inline
  def apply(
    disabled: scala.Double,
    none: scala.Double,
    serviceFlags: scala.Double,
    unChanged: scala.Double,
    verified: scala.Double
  ): ServiceFlags = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceFlags = serviceFlags.asInstanceOf[js.Any], unChanged = unChanged.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFlags]
  }
}

