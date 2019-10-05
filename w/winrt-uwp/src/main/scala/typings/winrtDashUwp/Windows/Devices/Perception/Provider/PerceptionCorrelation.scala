package typings.winrtDashUwp.Windows.Devices.Perception.Provider

import typings.winrtDashUwp.Windows.Foundation.Numerics.Quaternion
import typings.winrtDashUwp.Windows.Foundation.Numerics.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A description of the physical position and orientation of a device specified by the IPerceptionFrameProvider's unique identifier (PerceptionFrameProviderInfo::Id) sharing a common coordinate frame of other PerceptionCorrelations that will be combined into a PerceptionCorrelationGroup. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionCorrelation")
@js.native
class PerceptionCorrelation protected () extends js.Object {
  /**
    * Initializes a new PerceptionCorrelation instance.
    * @param targetId The unique identifier of the IPerceptionFrameProvider being described.
    * @param position The position of the device in a common coordinate frame of all members of a PerceptionCorrelationGroup.
    * @param orientation The orientation of the device in a common coordinate frame of all members of a PerceptionCorrelationGroup.
    */
  def this(targetId: String, position: Vector3, orientation: Quaternion) = this()
  /** The orientation of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
  var orientation: Quaternion = js.native
  /** The position of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
  var position: Vector3 = js.native
  /** The unique identifier of the described device. */
  var targetId: String = js.native
}

