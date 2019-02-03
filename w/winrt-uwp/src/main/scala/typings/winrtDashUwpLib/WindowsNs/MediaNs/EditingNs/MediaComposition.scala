package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of media clips and background audio tracks. */
@JSGlobal("Windows.Media.Editing.MediaComposition")
@js.native
/** Initializes a new instance of the MediaComposition class. */
class MediaComposition () extends js.Object {
  /** A collection of background audio tracks for playback in the media composition. */
  var backgroundAudioTracks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[BackgroundAudioTrack] = js.native
  /** A collection of media clips for playback in the media composition. */
  var clips: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[MediaClip] = js.native
  /** The total playback time of the media composition. */
  var duration: scala.Double = js.native
  /** Gets the list of overlay layers for the media composition. */
  var overlayLayers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[MediaOverlayLayer] = js.native
  /** An associative collection for storing custom properties associated with the media composition. */
  var userData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /**
    * Create a new default media encoding profile which can be modified if necessary.
    * @return The newly created MediaEncodingProfile .
    */
  def createDefaultEncodingProfile(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates a new MediaStreamSource .
    * @return The newly created MediaStreamSource .
    */
  def generateMediaStreamSource(): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSource = js.native
  /**
    * Creates a new MediaStreamSource using the specified MediaEncodingProfile .
    * @param encodingProfile The MediaEncodingProfile used to specify the encoding properties of the new MediaStreamSource .
    * @return The newly created MediaStreamSource .
    */
  def generateMediaStreamSource(encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSource = js.native
  /**
    * Creates a new MediaStreamSource used to preview the edited media.
    * @param scaledWidth The width of the preview media.
    * @param scaledHeight The height of the preview media.
    * @return The new MediaStreamSource used to preview the edited media.
    */
  def generatePreviewMediaStreamSource(scaledWidth: scala.Double, scaledHeight: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.MediaStreamSource = js.native
  /**
    * Asynchronously gets an image stream that represents a thumbnail of the media composition.
    * @param timeFromStart Specifies the point in the timeline of the MediaComposition from which to render the thumbnail, offset from the start of the MediaComposition.
    * @param scaledWidth Specifies the target width at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param scaledHeight Specifies the target height at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param framePrecision Specifies the frame precision algorithm to use when retrieving the thumbnail.
    * @return An image stream representing resulting thumbnail.
    */
  def getThumbnailAsync(
    timeFromStart: scala.Double,
    scaledWidth: scala.Double,
    scaledHeight: scala.Double,
    framePrecision: VideoFramePrecision
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.ImageStream] = js.native
  /**
    * Asynchronously gets a vector view of thumbnails of the media composition.
    * @param timesFromStart Specifies the points in the timeline of the MediaComposition from which to render the thumbnails, offset from the start of the MediaComposition.
    * @param scaledWidth Specifies the target width at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param scaledHeight Specifies the target height at which to render. The default is 0. scaledWidth and/or scaledHeight can be optional; see Remarks.
    * @param framePrecision Specifies the frame precision algorithm to use when retrieving the thumbnails.
    * @return A vector view on the resulting thumbnails.
    */
  def getThumbnailsAsync(
    timesFromStart: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[scala.Double],
    scaledWidth: scala.Double,
    scaledHeight: scala.Double,
    framePrecision: VideoFramePrecision
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously renders the MediaComposition to the specified file.
    * @param destination The file to which this MediaComposition is rendered.
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def renderToFileAsync(destination: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason, 
    scala.Double
  ] = js.native
  /**
    * Asynchronously renders the MediaComposition to a specified file using the indicated media trimming preference.
    * @param destination The file to which this MediaComposition is rendered.
    * @param trimmingPreference Specifies whether to be fast or precise when trimming the media.
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def renderToFileAsync(
    destination: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    trimmingPreference: MediaTrimmingPreference
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason, 
    scala.Double
  ] = js.native
  /**
    * Asynchronously renders the MediaComposition to a specified file using the indicated media trimming preference and encoding profile.
    * @param destination The file to which this MediaComposition is rendered.
    * @param trimmingPreference Specifies whether to be fast or precise when trimming the media.
    * @param encodingProfile Specifies the encoding profile to use for rendering the media.
    * @return An async operation which can be used to track the success or failure of the operation.
    */
  def renderToFileAsync(
    destination: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    trimmingPreference: MediaTrimmingPreference,
    encodingProfile: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.TranscodeFailureReason, 
    scala.Double
  ] = js.native
  /**
    * Asynchronously serializes the MediaComposition to disk so that it can be loaded and modified in the future.
    * @param file The file to which the MediaComposition is saved.
    * @return An async action which can be used to track the success or failure of the operation.
    */
  def saveAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
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
  def loadAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaComposition] = js.native
}

