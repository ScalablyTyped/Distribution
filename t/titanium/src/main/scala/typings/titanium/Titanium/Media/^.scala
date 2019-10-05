package typings.titanium.Titanium.Media

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Media")
@js.native
object ^ extends js.Object {
  /**
  		 * A constant for the audio session category to be used.
  		 */
  var audioSessionCategory: Double = js.native
  /**
  		 * A constant for the audio session mode to be used.
  		 */
  var audioSessionMode: Double = js.native
  /**
  		 * Array of media type constants supported for the camera.
  		 */
  var availableCameraMediaTypes: js.Array[js.Any] = js.native
  /**
  		 * Array of media type constants supported for saving to the device's camera roll or saved images album.
  		 */
  var availablePhotoGalleryMediaTypes: js.Array[js.Any] = js.native
  /**
  		 * Array of media type constants supported for the photo library.
  		 */
  var availablePhotoMediaTypes: js.Array[js.Any] = js.native
  /**
  		 * Current average microphone level in dB or -1 if microphone monitoring is disabled.
  		 */
  var averageMicrophonePower: Double = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Determines how the flash is fired when using the device's camera.
  		 */
  var cameraFlashMode: Double = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
}

