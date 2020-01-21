package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a frame of data from the device. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrame")
@js.native
abstract class PerceptionFrame () extends js.Object {
  /** The actual bytes of the frame which can be consumed as described by the Properties of the IPerceptionFrameProvider which produced the frame. */
  var frameData: IMemoryBuffer = js.native
  /** Gets the Properties for this frame. */
  var properties: ValueSet = js.native
  /** Gets or sets the Relative Time of this frame relative to other frames from this IPerceptionFrameProvider. */
  var relativeTime: Double = js.native
}

