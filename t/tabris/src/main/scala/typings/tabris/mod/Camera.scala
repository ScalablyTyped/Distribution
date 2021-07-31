package typings.tabris.mod

import typings.tabris.anon.Flash
import typings.tabris.anon.Height
import typings.tabris.anon.Width
import typings.tabris.tabrisStrings.active
import typings.tabris.tabrisStrings.back
import typings.tabris.tabrisStrings.captureResolution
import typings.tabris.tabrisStrings.external
import typings.tabris.tabrisStrings.front
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Camera")
@js.native
class Camera protected () extends NativeObject {
  
  /**
    * Setting `active` to true activates the camera. If it is currently assigned to a `CameraView`, the
    * `CameraView` will now show the video feed from the `Camera`. It is then possible to capture an image
    * via the `captureImage()` method.
    * Setting `active` to false stops the camera and disables any video feed shown on a `CameraView`.
    * It is recommended to stop the `Camera` when not in use in order to preserve battery life.
    */
  var active: Boolean = js.native
  
  /**
    * An array of resolutions supported by the camera. Each array entry is an object consisting of `width`
    * and `height`. Eg.: `{width: 4000, height: 3000}
    */
  val availableCaptureResolutions: js.Array[Width] = js.native
  
  /**
    * The id of the device camera given by the native platform.
    * @constant
    */
  val cameraId: String = js.native
  
  /**
    * Captures an image and returns a result object when the returned promise resolves successfully. The
    * `Camera` has to be in an `active` state to capture an image. The result object has an `image`
    * property of type `Blob` which contains the jpg encoded image, as well as a `width` and `height`
    * property describing the dimensions of the captured image.
    * @param options A set of capture options to apply when taking a picture. <br/><br/>If `flash` is set to `'auto'` the device will decide (based on the lighting conditions) whether to activate the flashlight.
    */
  def captureImage(): js.Promise[Height] = js.native
  def captureImage(options: Flash): js.Promise[Height] = js.native
  
  /**
    * An object determining the pixel dimensions of the captured image. Has to be an object containing
    * `width` and `height` properties of type `number`. The list of natively available resolutions can be
    * obtained from the `availableCaptureResolutions` property.
    * If the given `captureResolution` is not in the list of `availableCaptureResolutions`, a closely
    * matching resolution larger than the given resolution is used. When no `captureResolution` is given
    * (value is `null`), the best possible match for the device is chosen automatically. The physical
    * dimensions of the captured image should be checked on the resolved result object of the
    * `captureImage()` method.
    * When setting the `captureResolution` on the iOS platform, a small grace period should pass before
    * capturing an image. Otherwise the image might turn out incorrectly exposed.
    */
  var captureResolution: Width = js.native
  
  /**
    * Fired when the [*active*](#active) property has changed.
    */
  var onActiveChanged: ChangeListeners[this.type, active] = js.native
  
  /**
    * Fired when the [*availableCaptureResolutions*](#availableCaptureResolutions) property has changed.
    */
  var onAvailableCaptureResolutionsChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.availableCaptureResolutions] = js.native
  
  /**
    * Fired when the [*captureResolution*](#captureResolution) property has changed.
    */
  var onCaptureResolutionChanged: ChangeListeners[this.type, captureResolution] = js.native
  
  /**
    * The position of the camera on the device. The `external` position is used for devices like usb
    * cameras.
    * @constant
    */
  val position: front | back | external = js.native
}
