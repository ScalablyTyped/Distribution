package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a buffer containing audio data. */
@JSGlobal("Windows.Media.AudioBuffer")
@js.native
abstract class AudioBuffer ()
  extends StObject
     with typings.winrtUwp.Windows.Media.AudioBuffer {
  
  /** Gets the maximum number of bytes that the buffer can hold. */
  /* CompleteClass */
  var capacity: Double = js.native
  
  /** Disposes of the object and associated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Returns an IMemoryBufferReference representation of the audio buffer.
    * @return The IMemoryBufferReference representation of the audio buffer.
    */
  /* CompleteClass */
  override def createReference(): IMemoryBufferReference = js.native
  
  /** Gets or sets the number of bytes currently in use in the buffer. */
  /* CompleteClass */
  var length: Double = js.native
}
