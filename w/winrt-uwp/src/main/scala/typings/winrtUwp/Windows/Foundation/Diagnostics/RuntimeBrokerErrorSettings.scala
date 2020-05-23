package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents diagnostic error reporting settings. */
trait RuntimeBrokerErrorSettings extends js.Object {
  /**
    * Gets the type of error reporting for the error object.
    * @return One of the enumeration values.
    */
  def getErrorOptions(): ErrorOptions
  /**
    * Sets the type of error reporting for the error object.
    * @param value One of the enumeration values.
    */
  def setErrorOptions(value: ErrorOptions): Unit
}

object RuntimeBrokerErrorSettings {
  @scala.inline
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): RuntimeBrokerErrorSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
    __obj.asInstanceOf[RuntimeBrokerErrorSettings]
  }
}

