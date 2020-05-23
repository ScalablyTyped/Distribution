package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Numerics.Quaternion
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A description of the physical position and orientation of a device specified by the IPerceptionFrameProvider's unique identifier (PerceptionFrameProviderInfo::Id) sharing a common coordinate frame of other PerceptionCorrelations that will be combined into a PerceptionCorrelationGroup. */
trait PerceptionCorrelation extends js.Object {
  /** The orientation of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
  var orientation: Quaternion
  /** The position of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
  var position: Vector3
  /** The unique identifier of the described device. */
  var targetId: String
}

object PerceptionCorrelation {
  @scala.inline
  def apply(orientation: Quaternion, position: Vector3, targetId: String): PerceptionCorrelation = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionCorrelation]
  }
}

