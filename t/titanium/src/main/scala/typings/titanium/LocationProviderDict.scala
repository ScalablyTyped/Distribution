package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object describing a location provider.
  */
trait LocationProviderDict extends js.Object {
  /**
    * Accuracy of the location provider, either fine (1) or coarse (2).
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
    * Name of the location provider.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Power consumption for this provider, either low (1), medium (2), or high (3).
    */
  var power: js.UndefOr[Double] = js.undefined
}

object LocationProviderDict {
  @scala.inline
  def apply(
    accuracy: js.UndefOr[Double] = js.undefined,
    name: java.lang.String = null,
    power: js.UndefOr[Double] = js.undefined
  ): LocationProviderDict = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(power)) __obj.updateDynamic("power")(power.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProviderDict]
  }
}

