package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the advanced photo capture behavior on a capture device. */
@js.native
trait AdvancedPhotoControl extends js.Object {
  /** Gets the current advanced capture mode of the AdvancedPhotoControl . */
  var mode: AdvancedPhotoMode = js.native
  /** Gets a value indicating whether the AdvancedPhotoControl is supported on the current capture device. */
  var supported: Boolean = js.native
  /** Gets a list of the advanced capture modes supported by the current capture device. */
  var supportedModes: IVectorView[AdvancedPhotoMode] = js.native
  /**
    * Configures the AdvancedPhotoControl object with the specified settings.
    * @param settings The object defining the configuration settings.
    */
  def configure(settings: AdvancedPhotoCaptureSettings): Unit = js.native
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
  @scala.inline
  implicit class AdvancedPhotoControlOps[Self <: AdvancedPhotoControl] (val x: Self) extends AnyVal {
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
    def setConfigure(value: AdvancedPhotoCaptureSettings => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
    @scala.inline
    def setMode(value: AdvancedPhotoMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedModes(value: IVectorView[AdvancedPhotoMode]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
  }
  
}

