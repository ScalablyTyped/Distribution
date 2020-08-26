package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the zoom settings on a capture device. */
@js.native
trait ZoomControl extends js.Object {
  /** Gets the maximum zoom value supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum zoom value supported by the capture device. */
  var min: Double = js.native
  /** Gets a value indicating the current zoom transition mode. */
  var mode: ZoomTransitionMode = js.native
  /** Gets the smallest zoom value increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  var supported: Boolean = js.native
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[ZoomTransitionMode] = js.native
  /** Gets or sets the zoom value to be used by the capture device. */
  var value: Double = js.native
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  def configure(settings: ZoomSettings): Unit = js.native
}

object ZoomControl {
  @scala.inline
  def apply(
    configure: ZoomSettings => Unit,
    max: Double,
    min: Double,
    mode: ZoomTransitionMode,
    step: Double,
    supported: Boolean,
    supportedModes: IVectorView[ZoomTransitionMode],
    value: Double
  ): ZoomControl = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControl]
  }
  @scala.inline
  implicit class ZoomControlOps[Self <: ZoomControl] (val x: Self) extends AnyVal {
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
    def setConfigure(value: ZoomSettings => Unit): Self = this.set("configure", js.Any.fromFunction1(value))
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: ZoomTransitionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedModes(value: IVectorView[ZoomTransitionMode]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

