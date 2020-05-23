package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a frame of data from the device. */
trait PerceptionFrame extends js.Object {
  /** The actual bytes of the frame which can be consumed as described by the Properties of the IPerceptionFrameProvider which produced the frame. */
  var frameData: IMemoryBuffer
  /** Gets the Properties for this frame. */
  var properties: ValueSet
  /** Gets or sets the Relative Time of this frame relative to other frames from this IPerceptionFrameProvider. */
  var relativeTime: Double
}

object PerceptionFrame {
  @scala.inline
  def apply(frameData: IMemoryBuffer, properties: ValueSet, relativeTime: Double): PerceptionFrame = {
    val __obj = js.Dynamic.literal(frameData = frameData.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrame]
  }
}

