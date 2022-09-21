package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an audio media stream. */
@JSGlobal("Windows.Media.Core.AudioStreamDescriptor")
@js.native
open class AudioStreamDescriptor protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.AudioStreamDescriptor {
  /**
    * Creates an instance of AudioStreamDescriptor class using the specified AudioEncodingProperties .
    * @param encodingProperties The encoding properties for the audio stream.
    */
  def this(encodingProperties: AudioEncodingProperties) = this()
  
  /** The encoding properties of the stream. */
  /* CompleteClass */
  var encodingProperties: AudioEncodingProperties = js.native
  
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  /* CompleteClass */
  var isSelected: Boolean = js.native
  
  /** Gets or sets the RFC-1766 language code for the stream. */
  /* CompleteClass */
  var language: String = js.native
  
  /** Gets or sets the name of the stream. */
  /* CompleteClass */
  var name: String = js.native
}
