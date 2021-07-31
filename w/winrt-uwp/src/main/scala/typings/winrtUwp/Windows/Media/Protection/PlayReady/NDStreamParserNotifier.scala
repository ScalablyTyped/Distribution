package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.Core.AudioStreamDescriptor
import typings.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import typings.winrtUwp.Windows.Media.Core.MediaStreamSample
import typings.winrtUwp.Windows.Media.Core.VideoStreamDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods that a stream parser plug-in uses to send notifications to a PlayReady-ND client. */
trait NDStreamParserNotifier extends StObject {
  
  /**
    * Called by the stream parser when it requests a setup decryptor.
    * @param descriptor The descriptor of the media stream being decrypted.
    * @param keyID The key identifier used for decryption.
    * @param proBytes The data for the setup decryptor.
    */
  def onBeginSetupDecryptor(descriptor: IMediaStreamDescriptor, keyID: String, proBytes: js.Array[Double]): Unit
  
  /**
    * Called by a stream parser when it receives the content identifier.
    * @param licenseFetchDescriptor The license fetch descriptor containing the content identifier.
    */
  def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit
  
  /**
    * Called by the stream parser when the media stream descriptor is created.
    * @param audioStreamDescriptors An array of audio stream descriptors that are part of the media stream descriptor.
    * @param videoStreamDescriptors An array of video stream descriptors that are part of the media stream descriptor.
    */
  def onMediaStreamDescriptorCreated(
    audioStreamDescriptors: IVector[AudioStreamDescriptor],
    videoStreamDescriptors: IVector[VideoStreamDescriptor]
  ): Unit
  
  /**
    * Called when the stream parser parses a sample from the media stream.
    * @param streamID The identifier for the media stream that is being parsed.
    * @param streamType The type of the media stream. This value can be Audio or Video.
    * @param streamSample The array of stream samples.
    * @param pts The presentation timestamp that indicates when to play the sample, in milliseconds. This value is relative to previous samples in the presentation. For example, if a given sample has a presentation time stamp of 1000 and some later sample has a presentation time stamp of 2000, the later sample occurs one second (1000ms) after the given sample.
    * @param ccFormat The closed caption format. This value can be ATSC, SCTE20, or Unknown.
    * @param ccDataBytes An array that contains the closed caption data.
    */
  def onSampleParsed(
    streamID: Double,
    streamType: NDMediaStreamType,
    streamSample: MediaStreamSample,
    pts: Double,
    ccFormat: NDClosedCaptionFormat,
    ccDataBytes: js.Array[Double]
  ): Unit
}
object NDStreamParserNotifier {
  
  @scala.inline
  def apply(
    onBeginSetupDecryptor: (IMediaStreamDescriptor, String, js.Array[Double]) => Unit,
    onContentIDReceived: INDLicenseFetchDescriptor => Unit,
    onMediaStreamDescriptorCreated: (IVector[AudioStreamDescriptor], IVector[VideoStreamDescriptor]) => Unit,
    onSampleParsed: (Double, NDMediaStreamType, MediaStreamSample, Double, NDClosedCaptionFormat, js.Array[Double]) => Unit
  ): NDStreamParserNotifier = {
    val __obj = js.Dynamic.literal(onBeginSetupDecryptor = js.Any.fromFunction3(onBeginSetupDecryptor), onContentIDReceived = js.Any.fromFunction1(onContentIDReceived), onMediaStreamDescriptorCreated = js.Any.fromFunction2(onMediaStreamDescriptorCreated), onSampleParsed = js.Any.fromFunction6(onSampleParsed))
    __obj.asInstanceOf[NDStreamParserNotifier]
  }
  
  @scala.inline
  implicit class NDStreamParserNotifierMutableBuilder[Self <: NDStreamParserNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBeginSetupDecryptor(value: (IMediaStreamDescriptor, String, js.Array[Double]) => Unit): Self = StObject.set(x, "onBeginSetupDecryptor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnContentIDReceived(value: INDLicenseFetchDescriptor => Unit): Self = StObject.set(x, "onContentIDReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMediaStreamDescriptorCreated(value: (IVector[AudioStreamDescriptor], IVector[VideoStreamDescriptor]) => Unit): Self = StObject.set(x, "onMediaStreamDescriptorCreated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSampleParsed(
      value: (Double, NDMediaStreamType, MediaStreamSample, Double, NDClosedCaptionFormat, js.Array[Double]) => Unit
    ): Self = StObject.set(x, "onSampleParsed", js.Any.fromFunction6(value))
  }
}
