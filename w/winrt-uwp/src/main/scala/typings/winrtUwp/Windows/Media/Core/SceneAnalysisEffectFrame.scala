package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video frame that includes the results of the scene analysis operation. */
@js.native
trait SceneAnalysisEffectFrame extends js.Object {
  /** Gets or sets the duration of the scene analysis effect frame. */
  var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet = js.native
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the frame. */
  var frameControlValues: CapturedFrameControlValues = js.native
  /** Gets a HighDynamicRangeOutput object that provides recommended FrameController objects and a value indicating the certainty of the HDR analysis. */
  var highDynamicRange: HighDynamicRangeOutput = js.native
  /** Gets or sets a value that indicates whether a video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the frame is read-only. */
  var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of data the frame contains. */
  var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
}

object SceneAnalysisEffectFrame {
  @scala.inline
  def apply(
    close: () => Unit,
    duration: Double,
    extendedProperties: IPropertySet,
    frameControlValues: CapturedFrameControlValues,
    highDynamicRange: HighDynamicRangeOutput,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    systemRelativeTime: Double,
    `type`: String
  ): SceneAnalysisEffectFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], frameControlValues = frameControlValues.asInstanceOf[js.Any], highDynamicRange = highDynamicRange.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalysisEffectFrame]
  }
  @scala.inline
  implicit class SceneAnalysisEffectFrameOps[Self <: SceneAnalysisEffectFrame] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendedProperties(value: IPropertySet): Self = this.set("extendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameControlValues(value: CapturedFrameControlValues): Self = this.set("frameControlValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighDynamicRange(value: HighDynamicRangeOutput): Self = this.set("highDynamicRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDiscontinuous(value: Boolean): Self = this.set("isDiscontinuous", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeTime(value: Double): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemRelativeTime(value: Double): Self = this.set("systemRelativeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

