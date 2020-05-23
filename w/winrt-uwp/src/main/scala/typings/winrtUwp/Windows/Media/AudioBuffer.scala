package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a buffer containing audio data. */
trait AudioBuffer extends js.Object {
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double
  /** Gets or sets the number of bytes currently in use in the buffer. */
  var length: Double
  /** Disposes of the object and associated resources. */
  def close(): Unit
  /**
    * Returns an IMemoryBufferReference representation of the audio buffer.
    * @return The IMemoryBufferReference representation of the audio buffer.
    */
  def createReference(): IMemoryBufferReference
}

object AudioBuffer {
  @scala.inline
  def apply(capacity: Double, close: () => Unit, createReference: () => IMemoryBufferReference, length: Double): AudioBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBuffer]
  }
}

