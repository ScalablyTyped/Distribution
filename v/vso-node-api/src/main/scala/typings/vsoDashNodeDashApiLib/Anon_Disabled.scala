package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Double
  var enabled: scala.Double
  var paused: scala.Double
}

object Anon_Disabled {
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, paused: scala.Double): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("paused")(paused)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

