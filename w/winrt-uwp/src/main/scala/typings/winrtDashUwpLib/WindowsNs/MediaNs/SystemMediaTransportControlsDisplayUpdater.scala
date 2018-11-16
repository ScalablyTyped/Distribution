package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
@JSGlobal("Windows.Media.SystemMediaTransportControlsDisplayUpdater")
@js.native
abstract class SystemMediaTransportControlsDisplayUpdater () extends js.Object {
  /** Gets or sets the media id of the app. */
  var appMediaId: java.lang.String = js.native
  /** Gets the image properties associated with the currently playing media. */
  var imageProperties: ImageDisplayProperties = js.native
  /** Gets the music properties associated with the currently playing media. */
  var musicProperties: MusicDisplayProperties = js.native
  /** Gets or sets thumbnail image associated with the currently playing media. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
  /** Gets or sets the type of media. */
  var `type`: MediaPlaybackType = js.native
  /** Gets the video properties associated with the currently playing media. */
  var videoProperties: VideoDisplayProperties = js.native
  /** Clears out all of the media metadata. */
  def clearAll(): scala.Unit = js.native
  /**
               * Initialize the media properties using the specified file.
               * @param type The type of media.
               * @param source The file to initialize the media properties.
               * @return When this method completes, it returns a boolean value that indicates true if the operation succeeded; otherwise, false.
               */
  def copyFromFileAsync(`type`: MediaPlaybackType, source: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /** Updates the metadata for the currently playing media. */
  def update(): scala.Unit = js.native
}

