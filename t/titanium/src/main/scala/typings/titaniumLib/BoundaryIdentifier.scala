package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary to specify a boundary identifier for <Titanium.UI.iOS.CollisionBehavior.addBoundary>.
  */
trait BoundaryIdentifier extends js.Object {
  /**
  	 * Arbitrary identifier for the boundary
  	 */
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Start point for the boundary
  	 */
  var point1: js.UndefOr[Point] = js.undefined
  /**
  	 * End point for the boundary
  	 */
  var point2: js.UndefOr[Point] = js.undefined
}

