package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioParamDescriptor extends js.Object {
  var automationRate: js.UndefOr[AutomationRate] = js.undefined
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
}

object AudioParamDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    automationRate: AutomationRate = null,
    defaultValue: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null
  ): AudioParamDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (automationRate != null) __obj.updateDynamic("automationRate")(automationRate)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamDescriptor]
  }
}

