package typings.winrtUwp.Windows.Devices.Adc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single ADC channel. */
trait AdcChannel extends js.Object {
  /** Gets the ADC controller for this channel. */
  var controller: AdcController
  /** Closes the connection on this channel, making it available to be opened by others. */
  def close(): Unit
  /**
    * Reads the value as a percentage of the max value possible for this controller.
    * @return The value as percentage of the max value.
    */
  def readRatio(): Double
  /**
    * Reads the digital representation of the analog value from the ADC.
    * @return The digital value.
    */
  def readValue(): Double
}

object AdcChannel {
  @scala.inline
  def apply(close: () => Unit, controller: AdcController, readRatio: () => Double, readValue: () => Double): AdcChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controller = controller.asInstanceOf[js.Any], readRatio = js.Any.fromFunction0(readRatio), readValue = js.Any.fromFunction0(readValue))
    __obj.asInstanceOf[AdcChannel]
  }
}

