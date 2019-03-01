package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledNone extends js.Object {
  var disabled: scala.Double
  var none: scala.Double
  var serviceFlags: scala.Double
  var unChanged: scala.Double
  var verified: scala.Double
}

object Anon_DisabledNone {
  @scala.inline
  def apply(
    disabled: scala.Double,
    none: scala.Double,
    serviceFlags: scala.Double,
    unChanged: scala.Double,
    verified: scala.Double
  ): Anon_DisabledNone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("serviceFlags")(serviceFlags)
    __obj.updateDynamic("unChanged")(unChanged)
    __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[Anon_DisabledNone]
  }
}

