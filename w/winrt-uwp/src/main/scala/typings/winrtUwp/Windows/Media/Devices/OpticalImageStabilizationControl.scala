package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to enable optical image stabilization on the capture device. */
@js.native
trait OpticalImageStabilizationControl extends js.Object {
  /** Gets or sets a value indicating the current optical image stabilization mode of the capture device. */
  var mode: OpticalImageStabilizationMode = js.native
  /** Gets a value that indicates if the capture device supports the OpticalImageStabilizationControl . */
  var supported: Boolean = js.native
  /** Gets the list of OpticalImageStabilizationMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[OpticalImageStabilizationMode] = js.native
}

object OpticalImageStabilizationControl {
  @scala.inline
  def apply(
    mode: OpticalImageStabilizationMode,
    supported: Boolean,
    supportedModes: IVectorView[OpticalImageStabilizationMode]
  ): OpticalImageStabilizationControl = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpticalImageStabilizationControl]
  }
  @scala.inline
  implicit class OpticalImageStabilizationControlOps[Self <: OpticalImageStabilizationControl] (val x: Self) extends AnyVal {
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
    def setMode(value: OpticalImageStabilizationMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedModes(value: IVectorView[OpticalImageStabilizationMode]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
  }
  
}

