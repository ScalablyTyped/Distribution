package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledForceDirection extends js.Object {
  var enabled: scala.Boolean
  var forceDirection: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var roundness: scala.Double
  var `type`: java.lang.String
}

object Anon_EnabledForceDirection {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    roundness: scala.Double,
    `type`: java.lang.String,
    forceDirection: java.lang.String | scala.Boolean = null
  ): Anon_EnabledForceDirection = {
    val __obj = js.Dynamic.literal(enabled = enabled, roundness = roundness)
    __obj.updateDynamic("type")(`type`)
    if (forceDirection != null) __obj.updateDynamic("forceDirection")(forceDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledForceDirection]
  }
}

