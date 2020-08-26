package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
@js.native
trait SystemMediaTransportControlsDisplayUpdater extends js.Object {
  /** Gets or sets the media id of the app. */
  var appMediaId: String = js.native
  /** Gets the image properties associated with the currently playing media. */
  var imageProperties: ImageDisplayProperties = js.native
  /** Gets the music properties associated with the currently playing media. */
  var musicProperties: MusicDisplayProperties = js.native
  /** Gets or sets thumbnail image associated with the currently playing media. */
  var thumbnail: RandomAccessStreamReference = js.native
  /** Gets or sets the type of media. */
  var `type`: MediaPlaybackType = js.native
  /** Gets the video properties associated with the currently playing media. */
  var videoProperties: VideoDisplayProperties = js.native
  /** Clears out all of the media metadata. */
  def clearAll(): Unit = js.native
  /**
    * Initialize the media properties using the specified file.
    * @param type The type of media.
    * @param source The file to initialize the media properties.
    * @return When this method completes, it returns a boolean value that indicates true if the operation succeeded; otherwise, false.
    */
  def copyFromFileAsync(`type`: MediaPlaybackType, source: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Updates the metadata for the currently playing media. */
  def update(): Unit = js.native
}

object SystemMediaTransportControlsDisplayUpdater {
  @scala.inline
  def apply(
    appMediaId: String,
    clearAll: () => Unit,
    copyFromFileAsync: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean],
    imageProperties: ImageDisplayProperties,
    musicProperties: MusicDisplayProperties,
    thumbnail: RandomAccessStreamReference,
    `type`: MediaPlaybackType,
    update: () => Unit,
    videoProperties: VideoDisplayProperties
  ): SystemMediaTransportControlsDisplayUpdater = {
    val __obj = js.Dynamic.literal(appMediaId = appMediaId.asInstanceOf[js.Any], clearAll = js.Any.fromFunction0(clearAll), copyFromFileAsync = js.Any.fromFunction2(copyFromFileAsync), imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), videoProperties = videoProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsDisplayUpdater]
  }
  @scala.inline
  implicit class SystemMediaTransportControlsDisplayUpdaterOps[Self <: SystemMediaTransportControlsDisplayUpdater] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppMediaId(value: String): Self = this.set("appMediaId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearAll(value: () => Unit): Self = this.set("clearAll", js.Any.fromFunction0(value))
    @scala.inline
    def setCopyFromFileAsync(value: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("copyFromFileAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setImageProperties(value: ImageDisplayProperties): Self = this.set("imageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setMusicProperties(value: MusicDisplayProperties): Self = this.set("musicProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: RandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MediaPlaybackType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setVideoProperties(value: VideoDisplayProperties): Self = this.set("videoProperties", value.asInstanceOf[js.Any])
  }
  
}

