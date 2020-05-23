package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
@JSGlobal("Windows.Media.SystemMediaTransportControlsDisplayUpdater")
@js.native
abstract class SystemMediaTransportControlsDisplayUpdater ()
  extends typings.winrtUwp.Windows.Media.SystemMediaTransportControlsDisplayUpdater {
  /** Gets or sets the media id of the app. */
  /* CompleteClass */
  override var appMediaId: String = js.native
  /** Gets the image properties associated with the currently playing media. */
  /* CompleteClass */
  override var imageProperties: typings.winrtUwp.Windows.Media.ImageDisplayProperties = js.native
  /** Gets the music properties associated with the currently playing media. */
  /* CompleteClass */
  override var musicProperties: typings.winrtUwp.Windows.Media.MusicDisplayProperties = js.native
  /** Gets or sets thumbnail image associated with the currently playing media. */
  /* CompleteClass */
  override var thumbnail: RandomAccessStreamReference = js.native
  /** Gets or sets the type of media. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Media.MediaPlaybackType = js.native
  /** Gets the video properties associated with the currently playing media. */
  /* CompleteClass */
  override var videoProperties: typings.winrtUwp.Windows.Media.VideoDisplayProperties = js.native
  /** Clears out all of the media metadata. */
  /* CompleteClass */
  override def clearAll(): Unit = js.native
  /**
    * Initialize the media properties using the specified file.
    * @param type The type of media.
    * @param source The file to initialize the media properties.
    * @return When this method completes, it returns a boolean value that indicates true if the operation succeeded; otherwise, false.
    */
  /* CompleteClass */
  override def copyFromFileAsync(`type`: typings.winrtUwp.Windows.Media.MediaPlaybackType, source: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Updates the metadata for the currently playing media. */
  /* CompleteClass */
  override def update(): Unit = js.native
}

