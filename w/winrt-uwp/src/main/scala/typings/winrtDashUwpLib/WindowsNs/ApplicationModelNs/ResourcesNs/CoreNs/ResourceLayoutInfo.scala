package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Structure that determines version and counts of resources returned for the app package. */
trait ResourceLayoutInfo extends js.Object {
  /** Framework-generated checksum. */
  var checksum: scala.Double
  /** Major version of resources to be returned. */
  var majorVersion: scala.Double
  /** Minor version of resources to be returned. */
  var minorVersion: scala.Double
  /** Number of named resources to be returned. */
  var namedResourceCount: scala.Double
  /** Number of resource subtrees to be returned. */
  var resourceSubtreeCount: scala.Double
}

object ResourceLayoutInfo {
  @scala.inline
  def apply(
    checksum: scala.Double,
    majorVersion: scala.Double,
    minorVersion: scala.Double,
    namedResourceCount: scala.Double,
    resourceSubtreeCount: scala.Double
  ): ResourceLayoutInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checksum")(checksum)
    __obj.updateDynamic("majorVersion")(majorVersion)
    __obj.updateDynamic("minorVersion")(minorVersion)
    __obj.updateDynamic("namedResourceCount")(namedResourceCount)
    __obj.updateDynamic("resourceSubtreeCount")(resourceSubtreeCount)
    __obj.asInstanceOf[ResourceLayoutInfo]
  }
}

