package typings
package titaniumLib

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
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Name of the location provider.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Power consumption for this provider, either low (1), medium (2), or high (3).
  	 */
  var power: js.UndefOr[scala.Double] = js.undefined
}

