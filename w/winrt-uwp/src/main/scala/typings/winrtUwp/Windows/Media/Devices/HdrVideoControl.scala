package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to enable High Dynamic Range (HDR) video recording on the capture device. */
@js.native
trait HdrVideoControl extends js.Object {
  /** Gets or sets a value indicating the current High Dynamic Range (HDR) video recording mode of the capture device. */
  var mode: HdrVideoMode = js.native
  /** Gets a value that indicates if the capture device supports the HdrVideoControl . */
  var supported: Boolean = js.native
  /** Gets the list of HdrVideoMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[HdrVideoMode] = js.native
}

object HdrVideoControl {
  @scala.inline
  def apply(mode: HdrVideoMode, supported: Boolean, supportedModes: IVectorView[HdrVideoMode]): HdrVideoControl = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HdrVideoControl]
  }
  @scala.inline
  implicit class HdrVideoControlOps[Self <: HdrVideoControl] (val x: Self) extends AnyVal {
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
    def setMode(value: HdrVideoMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedModes(value: IVectorView[HdrVideoMode]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
  }
  
}

