package typings.titanium

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

object BoundaryIdentifier {
  @scala.inline
  def apply(identifier: java.lang.String = null, point1: Point = null, point2: Point = null): BoundaryIdentifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (point1 != null) __obj.updateDynamic("point1")(point1.asInstanceOf[js.Any])
    if (point2 != null) __obj.updateDynamic("point2")(point2.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundaryIdentifier]
  }
}

