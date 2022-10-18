package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SampleRequest event to provide information to the application. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSourceSampleRequest")
@js.native
open class MediaStreamSourceSampleRequest ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSampleRequest {
  
  /**
    * Defers assigning a MediaStreamSample to MediaStreamSourceSampleRequest object.
    * @return The deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Media.Core.MediaStreamSourceSampleRequestDeferral = js.native
  
  /**
    * Provides a status update to the MediaStreamSource while the application is temporarily unable to deliver a requested MediaStreamSample .
    * @param progress A value between 0 to 100 that indicates the progress towards being able to deliver the requested MediaStreamSample .
    */
  /* CompleteClass */
  override def reportSampleProgress(progress: Double): Unit = js.native
  
  /** Sets the MediaStreamSample requested by the MediaStreamSource . Applications deliver a MediaStreamSample to the MediaStreamSource by assigning a value to this property. */
  /* CompleteClass */
  var sample: typings.winrtUwp.Windows.Media.Core.MediaStreamSample = js.native
  
  /** Gets the IMediaStreamDescriptor interface of the stream for which a MediaStreamSample is being requested. */
  /* CompleteClass */
  var streamDescriptor: IMediaStreamDescriptor = js.native
}
