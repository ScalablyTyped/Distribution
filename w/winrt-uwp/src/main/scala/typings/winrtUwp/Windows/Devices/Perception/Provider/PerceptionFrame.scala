package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a frame of data from the device. */
@js.native
trait PerceptionFrame extends js.Object {
  
  /** The actual bytes of the frame which can be consumed as described by the Properties of the IPerceptionFrameProvider which produced the frame. */
  var frameData: IMemoryBuffer = js.native
  
  /** Gets the Properties for this frame. */
  var properties: ValueSet = js.native
  
  /** Gets or sets the Relative Time of this frame relative to other frames from this IPerceptionFrameProvider. */
  var relativeTime: Double = js.native
}
object PerceptionFrame {
  
  @scala.inline
  def apply(frameData: IMemoryBuffer, properties: ValueSet, relativeTime: Double): PerceptionFrame = {
    val __obj = js.Dynamic.literal(frameData = frameData.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrame]
  }
  
  @scala.inline
  implicit class PerceptionFrameOps[Self <: PerceptionFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrameData(value: IMemoryBuffer): Self = this.set("frameData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ValueSet): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTime(value: Double): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
  }
}
