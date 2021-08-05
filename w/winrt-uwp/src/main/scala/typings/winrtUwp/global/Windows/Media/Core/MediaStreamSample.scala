package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media sample used by the MediaStreamSource . */
@JSGlobal("Windows.Media.Core.MediaStreamSample")
@js.native
abstract class MediaStreamSample ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.MediaStreamSample
object MediaStreamSample {
  
  @JSGlobal("Windows.Media.Core.MediaStreamSample")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MediaStreamSample from an IBuffer .
    * @param buffer The buffer that contains the media data used to create the MediaStreamSample .
    * @param timestamp The presentation time of this sample.
    * @return The sample created from the data in buffer.
    */
  /* static member */
  inline def createFromBuffer(buffer: IBuffer, timestamp: Double): typings.winrtUwp.Windows.Media.Core.MediaStreamSample = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Core.MediaStreamSample]
  
  /**
    * Asynchronously creates a MediaStreamSample from an IInputStream .
    * @param stream The stream that contains the media data used to create the MediaStreamSample .
    * @param count The length of the data in the sample. This is the number of bytes that will be read from stream.
    * @param timestamp The presentation time of this MediaStreamSample .
    * @return When this method completes, it returns the new file as a MediaStreamSample .
    */
  /* static member */
  inline def createFromStreamAsync(stream: IInputStream, count: Double, timestamp: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Core.MediaStreamSample] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any], count.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Core.MediaStreamSample]]
}
