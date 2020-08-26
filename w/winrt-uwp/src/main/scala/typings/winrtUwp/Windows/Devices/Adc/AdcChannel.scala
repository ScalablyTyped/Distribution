package typings.winrtUwp.Windows.Devices.Adc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single ADC channel. */
@js.native
trait AdcChannel extends js.Object {
  /** Gets the ADC controller for this channel. */
  var controller: AdcController = js.native
  /** Closes the connection on this channel, making it available to be opened by others. */
  def close(): Unit = js.native
  /**
    * Reads the value as a percentage of the max value possible for this controller.
    * @return The value as percentage of the max value.
    */
  def readRatio(): Double = js.native
  /**
    * Reads the digital representation of the analog value from the ADC.
    * @return The digital value.
    */
  def readValue(): Double = js.native
}

object AdcChannel {
  @scala.inline
  def apply(close: () => Unit, controller: AdcController, readRatio: () => Double, readValue: () => Double): AdcChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controller = controller.asInstanceOf[js.Any], readRatio = js.Any.fromFunction0(readRatio), readValue = js.Any.fromFunction0(readValue))
    __obj.asInstanceOf[AdcChannel]
  }
  @scala.inline
  implicit class AdcChannelOps[Self <: AdcChannel] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setController(value: AdcController): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadRatio(value: () => Double): Self = this.set("readRatio", js.Any.fromFunction0(value))
    @scala.inline
    def setReadValue(value: () => Double): Self = this.set("readValue", js.Any.fromFunction0(value))
  }
  
}

