package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Structure that determines version and counts of resources returned for the app package. */
trait ResourceLayoutInfo extends js.Object {
  /** Framework-generated checksum. */
  var checksum: Double
  /** Major version of resources to be returned. */
  var majorVersion: Double
  /** Minor version of resources to be returned. */
  var minorVersion: Double
  /** Number of named resources to be returned. */
  var namedResourceCount: Double
  /** Number of resource subtrees to be returned. */
  var resourceSubtreeCount: Double
}

object ResourceLayoutInfo {
  @scala.inline
  def apply(
    checksum: Double,
    majorVersion: Double,
    minorVersion: Double,
    namedResourceCount: Double,
    resourceSubtreeCount: Double
  ): ResourceLayoutInfo = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], namedResourceCount = namedResourceCount.asInstanceOf[js.Any], resourceSubtreeCount = resourceSubtreeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLayoutInfo]
  }
}

