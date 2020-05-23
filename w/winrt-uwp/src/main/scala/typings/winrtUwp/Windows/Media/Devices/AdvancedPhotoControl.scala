package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the advanced photo capture behavior on a capture device. */
trait AdvancedPhotoControl extends js.Object {
  /** Gets the current advanced capture mode of the AdvancedPhotoControl . */
  var mode: AdvancedPhotoMode
  /** Gets a value indicating whether the AdvancedPhotoControl is supported on the current capture device. */
  var supported: Boolean
  /** Gets a list of the advanced capture modes supported by the current capture device. */
  var supportedModes: IVectorView[AdvancedPhotoMode]
  /**
    * Configures the AdvancedPhotoControl object with the specified settings.
    * @param settings The object defining the configuration settings.
    */
  def configure(settings: AdvancedPhotoCaptureSettings): Unit
}

object AdvancedPhotoControl {
  @scala.inline
  def apply(
    configure: AdvancedPhotoCaptureSettings => Unit,
    mode: AdvancedPhotoMode,
    supported: Boolean,
    supportedModes: IVectorView[AdvancedPhotoMode]
  ): AdvancedPhotoControl = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), mode = mode.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedPhotoControl]
  }
}

