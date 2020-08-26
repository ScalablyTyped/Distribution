package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.SampleRequest event to provide information to the application. */
@js.native
trait MediaStreamSourceSampleRequest extends js.Object {
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
  def reportSampleProgress(progress: Double): Unit = js.native
}

object MediaStreamSourceSampleRequest {
  @scala.inline
  def apply(
    getDeferral: () => MediaStreamSourceSampleRequestDeferral,
    reportSampleProgress: Double => Unit,
    sample: MediaStreamSample,
    streamDescriptor: IMediaStreamDescriptor
  ): MediaStreamSourceSampleRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), reportSampleProgress = js.Any.fromFunction1(reportSampleProgress), sample = sample.asInstanceOf[js.Any], streamDescriptor = streamDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSampleRequest]
  }
  @scala.inline
  implicit class MediaStreamSourceSampleRequestOps[Self <: MediaStreamSourceSampleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDeferral(value: () => MediaStreamSourceSampleRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setReportSampleProgress(value: Double => Unit): Self = this.set("reportSampleProgress", js.Any.fromFunction1(value))
    @scala.inline
    def setSample(value: MediaStreamSample): Self = this.set("sample", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamDescriptor(value: IMediaStreamDescriptor): Self = this.set("streamDescriptor", value.asInstanceOf[js.Any])
  }
  
}

