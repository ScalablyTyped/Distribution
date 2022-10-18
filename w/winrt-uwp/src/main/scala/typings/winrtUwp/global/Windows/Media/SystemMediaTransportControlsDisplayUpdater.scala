package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
/* note: abstract class */ @JSGlobal("Windows.Media.SystemMediaTransportControlsDisplayUpdater")
@js.native
open class SystemMediaTransportControlsDisplayUpdater ()
  extends StObject
     with typings.winrtUwp.Windows.Media.SystemMediaTransportControlsDisplayUpdater {
  
  /** Gets or sets the media id of the app. */
  /* CompleteClass */
  var appMediaId: String = js.native
  
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
  
  /** Gets the image properties associated with the currently playing media. */
  /* CompleteClass */
  var imageProperties: typings.winrtUwp.Windows.Media.ImageDisplayProperties = js.native
  
  /** Gets the music properties associated with the currently playing media. */
  /* CompleteClass */
  var musicProperties: typings.winrtUwp.Windows.Media.MusicDisplayProperties = js.native
  
  /** Gets or sets thumbnail image associated with the currently playing media. */
  /* CompleteClass */
  var thumbnail: RandomAccessStreamReference = js.native
  
  /** Gets or sets the type of media. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.Media.MediaPlaybackType = js.native
  
  /** Updates the metadata for the currently playing media. */
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /** Gets the video properties associated with the currently playing media. */
  /* CompleteClass */
  var videoProperties: typings.winrtUwp.Windows.Media.VideoDisplayProperties = js.native
}
