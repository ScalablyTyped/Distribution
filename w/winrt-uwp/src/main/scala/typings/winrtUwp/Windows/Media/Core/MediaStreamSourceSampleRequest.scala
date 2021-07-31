package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SampleRequest event to provide information to the application. */
trait MediaStreamSourceSampleRequest extends StObject {
  
  /**
    * Defers assigning a MediaStreamSample to MediaStreamSourceSampleRequest object.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSampleRequestDeferral
  
  /**
    * Provides a status update to the MediaStreamSource while the application is temporarily unable to deliver a requested MediaStreamSample .
    * @param progress A value between 0 to 100 that indicates the progress towards being able to deliver the requested MediaStreamSample .
    */
  def reportSampleProgress(progress: Double): Unit
  
  /** Sets the MediaStreamSample requested by the MediaStreamSource . Applications deliver a MediaStreamSample to the MediaStreamSource by assigning a value to this property. */
  var sample: MediaStreamSample
  
  /** Gets the IMediaStreamDescriptor interface of the stream for which a MediaStreamSample is being requested. */
  var streamDescriptor: IMediaStreamDescriptor
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
  implicit class MediaStreamSourceSampleRequestMutableBuilder[Self <: MediaStreamSourceSampleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => MediaStreamSourceSampleRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportSampleProgress(value: Double => Unit): Self = StObject.set(x, "reportSampleProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSample(value: MediaStreamSample): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamDescriptor(value: IMediaStreamDescriptor): Self = StObject.set(x, "streamDescriptor", value.asInstanceOf[js.Any])
  }
}
