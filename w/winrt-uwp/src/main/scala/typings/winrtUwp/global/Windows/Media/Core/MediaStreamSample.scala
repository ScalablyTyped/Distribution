package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media sample used by the MediaStreamSource . */
@JSGlobal("Windows.Media.Core.MediaStreamSample")
@js.native
abstract class MediaStreamSample ()
  extends typings.winrtUwp.Windows.Media.Core.MediaStreamSample
object MediaStreamSample {
  
  /**
    * Creates a MediaStreamSample from an IBuffer .
    * @param buffer The buffer that contains the media data used to create the MediaStreamSample .
    * @param timestamp The presentation time of this sample.
    * @return The sample created from the data in buffer.
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaStreamSample.createFromBuffer")
  @js.native
  def createFromBuffer(buffer: IBuffer, timestamp: Double): typings.winrtUwp.Windows.Media.Core.MediaStreamSample = js.native
  
  /**
    * Asynchronously creates a MediaStreamSample from an IInputStream .
    * @param stream The stream that contains the media data used to create the MediaStreamSample .
    * @param count The length of the data in the sample. This is the number of bytes that will be read from stream.
    * @param timestamp The presentation time of this MediaStreamSample .
    * @return When this method completes, it returns the new file as a MediaStreamSample .
    */
  /* static member */
  @JSGlobal("Windows.Media.Core.MediaStreamSample.createFromStreamAsync")
  @js.native
  def createFromStreamAsync(stream: IInputStream, count: Double, timestamp: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Core.MediaStreamSample] = js.native
}
