package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceDirection extends js.Object {
  var enabled: Boolean
  var forceDirection: js.UndefOr[String | Boolean] = js.undefined
  var roundness: Double
  var `type`: String
}

object ForceDirection {
  @scala.inline
  def apply(enabled: Boolean, roundness: Double, `type`: String, forceDirection: String | Boolean = null): ForceDirection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (forceDirection != null) __obj.updateDynamic("forceDirection")(forceDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceDirection]
  }
}

