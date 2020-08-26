package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the exposure settings on a capture device. */
@js.native
trait ExposureControl extends js.Object {
  /** Gets a value that indicates if auto exposure is enabled. */
  var auto: Boolean = js.native
  /** Gets the maximum exposure time. */
  var max: Double = js.native
  /** Gets the minimum exposure time. */
  var min: Double = js.native
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure control. */
  var supported: Boolean = js.native
  /** Gets the exposure time. */
  var value: Double = js.native
  /**
    * Asynchronously enables or disable auto exposure.
    * @param value Specifies whether or not to enable or disable auto exposure.
    * @return The object that is used to control the asynchronous operation.
    */
  def setAutoAsync(value: Boolean): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the exposure time.
    * @param shutterDuration The exposure time to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(shutterDuration: Double): IPromiseWithIAsyncAction = js.native
}

object ExposureControl {
  @scala.inline
  def apply(
    auto: Boolean,
    max: Double,
    min: Double,
    setAutoAsync: Boolean => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): ExposureControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], setAutoAsync = js.Any.fromFunction1(setAutoAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposureControl]
  }
  @scala.inline
  implicit class ExposureControlOps[Self <: ExposureControl] (val x: Self) extends AnyVal {
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAutoAsync(value: Boolean => IPromiseWithIAsyncAction): Self = this.set("setAutoAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValueAsync(value: Double => IPromiseWithIAsyncAction): Self = this.set("setValueAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

