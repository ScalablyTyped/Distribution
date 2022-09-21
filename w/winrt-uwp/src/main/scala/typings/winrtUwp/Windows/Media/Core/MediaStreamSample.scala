package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.Buffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.processed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media sample used by the MediaStreamSource . */
@js.native
trait MediaStreamSample extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processed(`type`: processed, listener: TypedEventHandler[MediaStreamSample, Any]): Unit = js.native
  
  /** Gets the buffer which encapsulates the MediaStreamSample data. */
  var buffer: Buffer = js.native
  
  /** Gets and sets the decode timestamp for this MediaStreamSample . */
  var decodeTimestamp: Double = js.native
  
  /** Gets or sets a value to indicate that the previous MediaStreamSample in the sequence is missing. */
  var discontinuous: Boolean = js.native
  
  /** Gets the duration of the sample. */
  var duration: Double = js.native
  
  /** Gets the extended property set which enables getting and setting properties on the MediaStreamSample . */
  var extendedProperties: MediaStreamSamplePropertySet = js.native
  
  /** Gets or sets a value that indicates the MediaStreamSample contains a keyframe. */
  var keyFrame: Boolean = js.native
  
  /** Occurs when the MediaStreamSample has been processed by the media pipeline. */
  def onprocessed(ev: Any & WinRTEvent[MediaStreamSample]): Unit = js.native
  /** Occurs when the MediaStreamSample has been processed by the media pipeline. */
  @JSName("onprocessed")
  var onprocessed_Original: TypedEventHandler[MediaStreamSample, Any] = js.native
  
  /** Gets a MediaStreamSampleProtectionProperties object, which is used for getting and setting properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
  var protection: MediaStreamSampleProtectionProperties = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processed(`type`: processed, listener: TypedEventHandler[MediaStreamSample, Any]): Unit = js.native
  
  /** Gets the time at which a sample should be rendered. This is also referred to as the presentation time. */
  var timestamp: Double = js.native
}
