package typings.winrtUwp.Windows.Media.Transcoding

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Media.Core.IMediaSource
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Transcodes audio and video files. */
@js.native
trait MediaTranscoder extends js.Object {
  
  /**
    * Adds the specified audio effect.
    * @param activatableClassId The identifier of the audio effect.
    */
  def addAudioEffect(activatableClassId: String): Unit = js.native
  /**
    * Adds the specified audio effect with configuration properties, and indicates whether the effect is required.
    * @param activatableClassId The identifier of the audio effect.
    * @param effectRequired Indicates whether the audio effect is required.
    * @param configuration Configuration properties for the audio effect.
    */
  def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
  
  /**
    * Adds the specified video effect.
    * @param activatableClassId The identifier of the video effect.
    */
  def addVideoEffect(activatableClassId: String): Unit = js.native
  /**
    * Adds the specified video effect with configuration properties and indicates whether the effect is required.
    * @param activatableClassId The identifier of the video effect.
    * @param effectRequired Indicates whether the video effect is required.
    * @param configuration Configuration properties for the video effect.
    */
  def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
  
  /** Specifies whether the media transcoder always re-encodes the source. */
  var alwaysReencode: Boolean = js.native
  
  /** Removes all audio and video effects from the transcode session. */
  def clearEffects(): Unit = js.native
  
  /** Specifies whether hardware acceleration is enabled. */
  var hardwareAccelerationEnabled: Boolean = js.native
  
  /**
    * Asynchronously initializes the trancode operation on the specified file and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
    * @param source The source file.
    * @param destination The destination file.
    * @param profile The profile to use for the operation.
    * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
    */
  def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
  
  /**
    * Asynchronously initializes the trancode operation on the specified media source and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
    * @param source The media source to perform the transcode operation on.
    * @param destination The destination stream for the transcoded media data.
    * @param profile The profile to use for the operation.
    * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
    */
  def prepareMediaStreamSourceTranscodeAsync(source: IMediaSource, destination: IRandomAccessStream, profile: MediaEncodingProfile): IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
  
  /**
    * Asynchronously initializes the trancode operation on the specified stream and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
    * @param source The source stream.
    * @param destination The destination stream.
    * @param profile The profile to use for the operation.
    * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
    */
  def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
  
  /** Gets or sets the time interval to trim from the start of the output. */
  var trimStartTime: Double = js.native
  
  /** Gets or sets the time interval to trim from the end of the output. */
  var trimStopTime: Double = js.native
  
  /** Gets or sets the video processing algorithm which will be used for transcoding. */
  var videoProcessingAlgorithm: MediaVideoProcessingAlgorithm = js.native
}
