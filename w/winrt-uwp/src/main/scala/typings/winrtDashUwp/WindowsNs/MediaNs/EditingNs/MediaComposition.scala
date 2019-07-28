package typings.winrtDashUwp.WindowsNs.MediaNs.EditingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.ImageStream
import typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.MediaStreamSource
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
import typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageFile
import typings.winrtDashUwp.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of media clips and background audio tracks. */
@JSGlobal("Windows.Media.Editing.MediaComposition")
@js.native
/** Initializes a new instance of the MediaComposition class. */
class MediaComposition () extends js.Object {
  /** A collection of background audio tracks for playback in the media composition. */
  var backgroundAudioTracks: IVector[BackgroundAudioTrack] = js.native
  /** A collection of media clips for playback in the media composition. */
  var clips: IVector[MediaClip] = js.native
  /** The total playback time of the media composition. */
  var duration: Double = js.native
  /** Gets the list of overlay layers for the media composition. */
  var overlayLayers: IVector[MediaOverlayLayer] = js.native
  /** An associative collection for storing custom properties associated with the media composition. */
  var userData: IMap[String, String] = js.native
  /**
    * Create a new default media encoding profile which can be modified if necessary.
    * @return The newly created MediaEncodingProfile .
    */
  def createDefaultEncodingProfile(): MediaEncodingProfile = js.native
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
}

/* static members */
@JSGlobal("Windows.Media.Editing.MediaComposition")
@js.native
object MediaComposition extends js.Object {
  /**
    * Asynchronously loads a MediaComposition from a StorageFile .
    * @param file The file from which to load the MediaComposition .
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def loadAsync(file: StorageFile): IPromiseWithIAsyncOperation[MediaComposition] = js.native
}

