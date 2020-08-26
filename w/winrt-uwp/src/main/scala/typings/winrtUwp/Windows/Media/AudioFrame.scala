package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of audio data. */
@js.native
trait AudioFrame extends js.Object {
  /** Gets or sets the duration of the audio frame. */
  var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the AudioFrame . */
  var extendedProperties: IPropertySet = js.native
  /** Gets or sets a value that indicates whether an audio frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the audio frame is read-only. */
  var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the audio stream. */
  var relativeTime: Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of audio data the audio frame contains. */
  var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Gets a AudioBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned audio buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: AudioBufferAccessMode): AudioBuffer = js.native
}

object AudioFrame {
  @scala.inline
  def apply(
    close: () => Unit,
    duration: Double,
    extendedProperties: IPropertySet,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    lockBuffer: AudioBufferAccessMode => AudioBuffer,
    relativeTime: Double,
    systemRelativeTime: Double,
    `type`: String
  ): AudioFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], lockBuffer = js.Any.fromFunction1(lockBuffer), relativeTime = relativeTime.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFrame]
  }
  @scala.inline
  implicit class AudioFrameOps[Self <: AudioFrame] (val x: Self) extends AnyVal {
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
    def setIsDiscontinuous(value: Boolean): Self = this.set("isDiscontinuous", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockBuffer(value: AudioBufferAccessMode => AudioBuffer): Self = this.set("lockBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def setRelativeTime(value: Double): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemRelativeTime(value: Double): Self = this.set("systemRelativeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

