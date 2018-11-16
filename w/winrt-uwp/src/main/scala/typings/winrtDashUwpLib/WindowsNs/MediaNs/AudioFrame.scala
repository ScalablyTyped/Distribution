package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of audio data. */
@JSGlobal("Windows.Media.AudioFrame")
@js.native
class AudioFrame protected () extends js.Object {
  /**
               * Initializes a new instance of the AudioFrame class.
               * @param capacity The maximum number of bytes that the buffer can hold.
               */
  def this(capacity: scala.Double) = this()
  /** Gets or sets the duration of the audio frame. */
  var duration: scala.Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the AudioFrame . */
  var extendedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets a value that indicates whether an audio frame is the first frame after a gap in the stream. */
  var isDiscontinuous: scala.Boolean = js.native
  /** Gets a value indicating whether the audio frame is read-only. */
  var isReadOnly: scala.Boolean = js.native
  /** Gets or sets the relative time of the frame within the audio stream. */
  var relativeTime: scala.Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: scala.Double = js.native
  /** Gets a string indicating the type of audio data the audio frame contains. */
  var `type`: java.lang.String = js.native
  /** Disposes of the object and associated resources. */
  def close(): scala.Unit = js.native
  /**
               * Gets a AudioBuffer object that allows you to operate directly on the software bitmap's pixel data.
               * @param mode A value indicating the access mode of the returned audio buffer.
               * @return The buffer containing pixel data.
               */
  def lockBuffer(mode: AudioBufferAccessMode): AudioBuffer = js.native
}

