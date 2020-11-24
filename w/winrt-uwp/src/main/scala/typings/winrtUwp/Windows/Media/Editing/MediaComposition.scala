package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Graphics.Imaging.ImageStream
import typings.winrtUwp.Windows.Media.Core.MediaStreamSource
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrtUwp.Windows.Media.Transcoding.TranscodeFailureReason
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of media clips and background audio tracks. */
@js.native
trait MediaComposition extends js.Object {
  
  /** A collection of background audio tracks for playback in the media composition. */
  var backgroundAudioTracks: IVector[BackgroundAudioTrack] = js.native
  
  /** A collection of media clips for playback in the media composition. */
  var clips: IVector[MediaClip] = js.native
  
  /**
    * Create a new default media encoding profile which can be modified if necessary.
    * @return The newly created MediaEncodingProfile .
    */
  def createDefaultEncodingProfile(): MediaEncodingProfile = js.native
  
  /** The total playback time of the media composition. */
  var duration: Double = js.native
  
  /**
    * Creates a new MediaStreamSource .
    * @return The newly created MediaStreamSource .
    */
  def generateMediaStreamSource(): MediaStreamSource = js.native
  /**
    * Creates a new MediaStreamSource using the specified MediaEncodingProfile .
    * @param encodingProfile The MediaEncodingProfile used to specify the encoding properties of the new MediaStreamSource .
    * @return The newly created MediaStreamSource .
    */
  def generateMediaStreamSource(encodingProfile: MediaEncodingProfile): MediaStreamSource = js.native
  
  /**
    * Creates a new MediaStreamSource used to preview the edited media.
    * @param scaledWidth The width of the preview media.
    * @param scaledHeight The height of the preview media.
    * @return The new MediaStreamSource used to preview the edited media.
    */
  def generatePreviewMediaStreamSource(scaledWidth: Double, scaledHeight: Double): MediaStreamSource = js.native
  
  /**
    * Asynchronously gets an image stream that represents a thumbnail of the media composition.
    * @param timeFromStart Specifies the point in the timeline of the MediaComposition from which to render the thumbnail, offset from the start of the MediaComposition.
    * @param scaledWidth Specifies the target width at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param scaledHeight Specifies the target height at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param framePrecision Specifies the frame precision algorithm to use when retrieving the thumbnail.
    * @return An image stream representing resulting thumbnail.
    */
  def getThumbnailAsync(
    timeFromStart: Double,
    scaledWidth: Double,
    scaledHeight: Double,
    framePrecision: VideoFramePrecision
  ): IPromiseWithIAsyncOperation[ImageStream] = js.native
  
  /**
    * Asynchronously gets a vector view of thumbnails of the media composition.
    * @param timesFromStart Specifies the points in the timeline of the MediaComposition from which to render the thumbnails, offset from the start of the MediaComposition.
    * @param scaledWidth Specifies the target width at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param scaledHeight Specifies the target height at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param framePrecision Specifies the frame precision algorithm to use when retrieving the thumbnails.
    * @return A vector view on the resulting thumbnails.
    */
  def getThumbnailsAsync(
    timesFromStart: IIterable[Double],
    scaledWidth: Double,
    scaledHeight: Double,
    framePrecision: VideoFramePrecision
  ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /** Gets the list of overlay layers for the media composition. */
  var overlayLayers: IVector[MediaOverlayLayer] = js.native
  
  /**
    * Asynchronously renders the MediaComposition to the specified file.
    * @param destination The file to which this MediaComposition is rendered.
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def renderToFileAsync(destination: IStorageFile): IPromiseWithIAsyncOperationWithProgress[TranscodeFailureReason, Double] = js.native
  /**
    * Asynchronously renders the MediaComposition to a specified file using the indicated media trimming preference.
    * @param destination The file to which this MediaComposition is rendered.
    * @param trimmingPreference Specifies whether to be fast or precise when trimming the media.
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def renderToFileAsync(destination: IStorageFile, trimmingPreference: MediaTrimmingPreference): IPromiseWithIAsyncOperationWithProgress[TranscodeFailureReason, Double] = js.native
  /**
    * Asynchronously renders the MediaComposition to a specified file using the indicated media trimming preference and encoding profile.
    * @param destination The file to which this MediaComposition is rendered.
    * @param trimmingPreference Specifies whether to be fast or precise when trimming the media.
    * @param encodingProfile Specifies the encoding profile to use for rendering the media.
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def renderToFileAsync(
    destination: IStorageFile,
    trimmingPreference: MediaTrimmingPreference,
    encodingProfile: MediaEncodingProfile
  ): IPromiseWithIAsyncOperationWithProgress[TranscodeFailureReason, Double] = js.native
  
  /**
    * Asynchronously serializes the MediaComposition to disk so that it can be loaded and modified in the future.
    * @param file The file to which the MediaComposition is saved.
    * @return An async action which can be used to track the success or failure of the operation.
    */
  def saveAsync(file: IStorageFile): IPromiseWithIAsyncAction = js.native
  
  /** An associative collection for storing custom properties associated with the media composition. */
  var userData: IMap[String, String] = js.native
}
