package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maximum extends js.Object {
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Maximum {
  @scala.inline
  def apply(maximum: scala.Int | scala.Double = null, minimum: scala.Int | scala.Double = null): Anon_Maximum = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Maximum]
  }
}

