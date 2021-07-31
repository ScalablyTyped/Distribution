package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a buffer containing audio data. */
trait AudioBuffer extends StObject {
  
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /**
    * Returns an IMemoryBufferReference representation of the audio buffer.
    * @return The IMemoryBufferReference representation of the audio buffer.
    */
  def createReference(): IMemoryBufferReference
  
  /** Gets or sets the number of bytes currently in use in the buffer. */
  var length: Double
}
object AudioBuffer {
  
  @scala.inline
  def apply(capacity: Double, close: () => Unit, createReference: () => IMemoryBufferReference, length: Double): AudioBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBuffer]
  }
  
  @scala.inline
  implicit class AudioBufferMutableBuilder[Self <: AudioBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateReference(value: () => IMemoryBufferReference): Self = StObject.set(x, "createReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
