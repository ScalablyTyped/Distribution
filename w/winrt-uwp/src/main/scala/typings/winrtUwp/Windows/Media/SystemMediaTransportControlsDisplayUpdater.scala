package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
@js.native
trait SystemMediaTransportControlsDisplayUpdater extends StObject {
  
  /** Gets or sets the media id of the app. */
  var appMediaId: String = js.native
  
  /** Clears out all of the media metadata. */
  def clearAll(): Unit = js.native
  
  /**
    * Initialize the media properties using the specified file.
    * @param type The type of media.
    * @param source The file to initialize the media properties.
    * @return When this method completes, it returns a boolean value that indicates true if the operation succeeded; otherwise, false.
    */
  def copyFromFileAsync(`type`: MediaPlaybackType, source: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets the image properties associated with the currently playing media. */
  var imageProperties: ImageDisplayProperties = js.native
  
  /** Gets the music properties associated with the currently playing media. */
  var musicProperties: MusicDisplayProperties = js.native
  
  /** Gets or sets thumbnail image associated with the currently playing media. */
  var thumbnail: RandomAccessStreamReference = js.native
  
  /** Gets or sets the type of media. */
  var `type`: MediaPlaybackType = js.native
  
  /** Updates the metadata for the currently playing media. */
  def update(): Unit = js.native
  
  /** Gets the video properties associated with the currently playing media. */
  var videoProperties: VideoDisplayProperties = js.native
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
  implicit class SystemMediaTransportControlsDisplayUpdaterMutableBuilder[Self <: SystemMediaTransportControlsDisplayUpdater] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppMediaId(value: String): Self = StObject.set(x, "appMediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAll(value: () => Unit): Self = StObject.set(x, "clearAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyFromFileAsync(value: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "copyFromFileAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImageProperties(value: ImageDisplayProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicProperties(value: MusicDisplayProperties): Self = StObject.set(x, "musicProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: RandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaPlaybackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVideoProperties(value: VideoDisplayProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
  }
}
