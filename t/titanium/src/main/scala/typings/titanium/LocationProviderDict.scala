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
  def apply(accuracy: Int | Double = null, name: java.lang.String = null, power: Int | Double = null): LocationProviderDict = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProviderDict]
  }
}

