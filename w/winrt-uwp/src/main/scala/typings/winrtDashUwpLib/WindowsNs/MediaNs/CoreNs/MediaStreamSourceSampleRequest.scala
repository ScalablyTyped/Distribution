package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.SampleRequest event to provide information to the application. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSampleRequest")
@js.native
abstract class MediaStreamSourceSampleRequest () extends js.Object {
  /** Sets the MediaStreamSample requested by the MediaStreamSource . Applications deliver a MediaStreamSample to the MediaStreamSource by assigning a value to this property. */
  var sample: MediaStreamSample = js.native
  /** Gets the IMediaStreamDescriptor interface of the stream for which a MediaStreamSample is being requested. */
  var streamDescriptor: IMediaStreamDescriptor = js.native
  /**
    * Defers assigning a MediaStreamSample to MediaStreamSourceSampleRequest object.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSampleRequestDeferral = js.native
  /**
    * Provides a status update to the MediaStreamSource while the application is temporarily unable to deliver a requested MediaStreamSample .
    * @param progress A value between 0 to 100 that indicates the progress towards being able to deliver the requested MediaStreamSample .
    */
  def reportSampleProgress(progress: scala.Double): scala.Unit = js.native
}

