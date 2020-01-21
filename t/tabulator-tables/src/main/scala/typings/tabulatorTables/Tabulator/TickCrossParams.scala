package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickCrossParams extends _FormatterParams {
  // Tick Cross
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var allowTruthy: js.UndefOr[Boolean] = js.undefined
  var crossElement: js.UndefOr[Boolean | String] = js.undefined
  var tickElement: js.UndefOr[Boolean | String] = js.undefined
}

object TickCrossParams {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    allowTruthy: js.UndefOr[Boolean] = js.undefined,
    crossElement: Boolean | String = null,
    tickElement: Boolean | String = null
  ): TickCrossParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTruthy)) __obj.updateDynamic("allowTruthy")(allowTruthy.asInstanceOf[js.Any])
    if (crossElement != null) __obj.updateDynamic("crossElement")(crossElement.asInstanceOf[js.Any])
    if (tickElement != null) __obj.updateDynamic("tickElement")(tickElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickCrossParams]
  }
}

