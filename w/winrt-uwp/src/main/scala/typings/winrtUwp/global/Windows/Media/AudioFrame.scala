package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of audio data. */
@JSGlobal("Windows.Media.AudioFrame")
@js.native
class AudioFrame protected ()
  extends typings.winrtUwp.Windows.Media.AudioFrame {
  /**
    * Initializes a new instance of the AudioFrame class.
    * @param capacity The maximum number of bytes that the buffer can hold.
    */
  def this(capacity: Double) = this()
  /** Gets or sets the duration of the audio frame. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the AudioFrame . */
  /* CompleteClass */
  override var extendedProperties: IPropertySet = js.native
  /** Gets or sets a value that indicates whether an audio frame is the first frame after a gap in the stream. */
  /* CompleteClass */
  override var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the audio frame is read-only. */
  /* CompleteClass */
  override var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the audio stream. */
  /* CompleteClass */
  override var relativeTime: Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  /* CompleteClass */
  override var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of audio data the audio frame contains. */
  /* CompleteClass */
  override var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Gets a AudioBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned audio buffer.
    * @return The buffer containing pixel data.
    */
  /* CompleteClass */
  override def lockBuffer(mode: typings.winrtUwp.Windows.Media.AudioBufferAccessMode): typings.winrtUwp.Windows.Media.AudioBuffer = js.native
}

