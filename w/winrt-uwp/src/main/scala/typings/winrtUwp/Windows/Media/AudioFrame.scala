package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single frame of audio data. */
trait AudioFrame extends StObject {
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /** Gets or sets the duration of the audio frame. */
  var duration: Double
  
  /** Gets the extended property set which enables getting and setting properties on the AudioFrame . */
  var extendedProperties: IPropertySet
  
  /** Gets or sets a value that indicates whether an audio frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean
  
  /** Gets a value indicating whether the audio frame is read-only. */
  var isReadOnly: Boolean
  
  /**
    * Gets a AudioBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned audio buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: AudioBufferAccessMode): AudioBuffer
  
  /** Gets or sets the relative time of the frame within the audio stream. */
  var relativeTime: Double
  
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double
  
  /** Gets a string indicating the type of audio data the audio frame contains. */
  var `type`: String
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
  implicit class AudioFrameMutableBuilder[Self <: AudioFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedProperties(value: IPropertySet): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDiscontinuous(value: Boolean): Self = StObject.set(x, "isDiscontinuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockBuffer(value: AudioBufferAccessMode => AudioBuffer): Self = StObject.set(x, "lockBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemRelativeTime(value: Double): Self = StObject.set(x, "systemRelativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
