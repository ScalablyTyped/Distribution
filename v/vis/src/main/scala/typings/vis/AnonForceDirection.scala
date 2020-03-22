package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceDirection extends js.Object {
  var enabled: Boolean
  var forceDirection: js.UndefOr[String | Boolean] = js.undefined
  var roundness: Double
  var `type`: String
}

object AnonForceDirection {
  @scala.inline
  def apply(enabled: Boolean, roundness: Double, `type`: String, forceDirection: String | Boolean = null): AnonForceDirection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (forceDirection != null) __obj.updateDynamic("forceDirection")(forceDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceDirection]
  }
}

