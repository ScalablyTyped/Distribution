package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickCrossParams extends _FormatterParams {
  // Tick Cross
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var allowTruthy: js.UndefOr[scala.Boolean] = js.undefined
  var crossElement: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var tickElement: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object TickCrossParams {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    allowTruthy: js.UndefOr[scala.Boolean] = js.undefined,
    crossElement: scala.Boolean | java.lang.String = null,
    tickElement: scala.Boolean | java.lang.String = null
  ): TickCrossParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(allowTruthy)) __obj.updateDynamic("allowTruthy")(allowTruthy)
    if (crossElement != null) __obj.updateDynamic("crossElement")(crossElement.asInstanceOf[js.Any])
    if (tickElement != null) __obj.updateDynamic("tickElement")(tickElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickCrossParams]
  }
}

