package typings
package winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Transcodes audio and video files. */
@JSGlobal("Windows.Media.Transcoding.MediaTranscoder")
@js.native
class MediaTranscoder () extends js.Object {
  /** Specifies whether the media transcoder always re-encodes the source. */
  var alwaysReencode: scala.Boolean = js.native
  /** Specifies whether hardware acceleration is enabled. */
  var hardwareAccelerationEnabled: scala.Boolean = js.native
  /** Gets or sets the time interval to trim from the start of the output. */
  var trimStartTime: scala.Double = js.native
  /** Gets or sets the time interval to trim from the end of the output. */
  var trimStopTime: scala.Double = js.native
  /** Gets or sets the video processing algorithm which will be used for transcoding. */
  var videoProcessingAlgorithm: MediaVideoProcessingAlgorithm = js.native
  /**
                   * Adds the specified audio effect.
                   * @param activatableClassId The identifier of the audio effect.
                   */
  def addAudioEffect(activatableClassId: java.lang.String): scala.Unit = js.native
  /**
                   * Adds the specified audio effect with configuration properties, and indicates whether the effect is required.
                   * @param activatableClassId The identifier of the audio effect.
                   * @param effectRequired Indicates whether the audio effect is required.
                   * @param configuration Configuration properties for the audio effect.
                   */
  def addAudioEffect(
    activatableClassId: java.lang.String,
    effectRequired: scala.Boolean,
    configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  /**
                   * Adds the specified video effect.
                   * @param activatableClassId The identifier of the video effect.
                   */
  def addVideoEffect(activatableClassId: java.lang.String): scala.Unit = js.native
  /**
                   * Adds the specified video effect with configuration properties and indicates whether the effect is required.
                   * @param activatableClassId The identifier of the video effect.
                   * @param effectRequired Indicates whether the video effect is required.
                   * @param configuration Configuration properties for the video effect.
                   */
  def addVideoEffect(
    activatableClassId: java.lang.String,
    effectRequired: scala.Boolean,
    configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): scala.Unit = js.native
  /** Removes all audio and video effects from the transcode session. */
  def clearEffects(): scala.Unit = js.native
  /**
                   * Asynchronously initializes the trancode operation on the specified file and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
                   * @param source The source file.
                   * @param destination The destination file.
                   * @param profile The profile to use for the operation.
                   * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
                   */
  def prepareFileTranscodeAsync(
    source: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    destination: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    profile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
  /**
                   * Asynchronously initializes the trancode operation on the specified media source and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
                   * @param source The media source to perform the transcode operation on.
                   * @param destination The destination stream for the transcoded media data.
                   * @param profile The profile to use for the operation.
                   * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
                   */
  def prepareMediaStreamSourceTranscodeAsync(
    source: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.IMediaSource,
    destination: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    profile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
  /**
                   * Asynchronously initializes the trancode operation on the specified stream and returns a PrepareTranscodeResult object which can be used to start the transcode operation.
                   * @param source The source stream.
                   * @param destination The destination stream.
                   * @param profile The profile to use for the operation.
                   * @return When this method completes, a PrepareTranscodeResult object is returned which can be used to start the transcode.
                   */
  def prepareStreamTranscodeAsync(
    source: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    destination: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    profile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PrepareTranscodeResult] = js.native
}

