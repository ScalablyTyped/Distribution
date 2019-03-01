package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledEnabled extends js.Object {
  var disabled: scala.Double
  var enabled: scala.Double
  var undefined: scala.Double
}

object Anon_DisabledEnabled {
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, undefined: scala.Double): Anon_DisabledEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_DisabledEnabled]
  }
}

