package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for modifying exposure levels of captured photos. */
@js.native
trait ExposureCompensationControl extends js.Object {
  /** Gets the maximum exposure time. */
  var max: Double = js.native
  /** Gets the minimum exposure time. */
  var min: Double = js.native
  /** Gets the smallest exposure compensation increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure compensation control. */
  var supported: Boolean = js.native
  /** Gets the exposure compensation level. */
  var value: Double = js.native
  /**
    * Asynchronously sets the exposure compensation.
    * @param value The exposure compensation level to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(value: Double): IPromiseWithIAsyncAction = js.native
}

object ExposureCompensationControl {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): ExposureCompensationControl = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposureCompensationControl]
  }
  @scala.inline
  implicit class ExposureCompensationControlOps[Self <: ExposureCompensationControl] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
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

