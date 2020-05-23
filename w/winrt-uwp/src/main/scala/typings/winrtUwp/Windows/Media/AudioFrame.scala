package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of audio data. */
trait AudioFrame extends js.Object {
  /** Gets or sets the duration of the audio frame. */
  var duration: Double
  /** Gets the extended property set which enables getting and setting properties on the AudioFrame . */
  var extendedProperties: IPropertySet
  /** Gets or sets a value that indicates whether an audio frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean
  /** Gets a value indicating whether the audio frame is read-only. */
  var isReadOnly: Boolean
  /** Gets or sets the relative time of the frame within the audio stream. */
  var relativeTime: Double
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double
  /** Gets a string indicating the type of audio data the audio frame contains. */
  var `type`: String
  /** Disposes of the object and associated resources. */
  def close(): Unit
  /**
    * Gets a AudioBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned audio buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: AudioBufferAccessMode): AudioBuffer
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
}

