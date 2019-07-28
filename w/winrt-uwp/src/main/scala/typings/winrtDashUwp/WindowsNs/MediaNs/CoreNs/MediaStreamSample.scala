package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.Buffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.processed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media sample used by the MediaStreamSource . */
@JSGlobal("Windows.Media.Core.MediaStreamSample")
@js.native
abstract class MediaStreamSample () extends js.Object {
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
  @JSName("onprocessed")
  var onprocessed_Original: TypedEventHandler[MediaStreamSample, _] = js.native
  /** Gets a MediaStreamSampleProtectionProperties object, which is used for getting and setting properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
  var protection: MediaStreamSampleProtectionProperties = js.native
  /** Gets the time at which a sample should be rendered. This is also referred to as the presentation time. */
  var timestamp: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_processed(`type`: processed, listener: TypedEventHandler[MediaStreamSample, _]): Unit = js.native
  /** Occurs when the MediaStreamSample has been processed by the media pipeline. */
  def onprocessed(ev: js.Any with WinRTEvent[MediaStreamSample]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_processed(`type`: processed, listener: TypedEventHandler[MediaStreamSample, _]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.Core.MediaStreamSample")
@js.native
object MediaStreamSample extends js.Object {
  /**
    * Creates a MediaStreamSample from an IBuffer .
    * @param buffer The buffer that contains the media data used to create the MediaStreamSample .
    * @param timestamp The presentation time of this sample.
    * @return The sample created from the data in buffer.
    */
  def createFromBuffer(buffer: IBuffer, timestamp: Double): MediaStreamSample = js.native
  /**
    * Asynchronously creates a MediaStreamSample from an IInputStream .
    * @param stream The stream that contains the media data used to create the MediaStreamSample .
    * @param count The length of the data in the sample. This is the number of bytes that will be read from stream.
    * @param timestamp The presentation time of this MediaStreamSample .
    * @return When this method completes, it returns the new file as a MediaStreamSample .
    */
  def createFromStreamAsync(stream: IInputStream, count: Double, timestamp: Double): IPromiseWithIAsyncOperation[MediaStreamSample] = js.native
}

