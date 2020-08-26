package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents diagnostic error reporting settings. */
@js.native
trait RuntimeBrokerErrorSettings extends js.Object {
  /**
    * Gets the type of error reporting for the error object.
    * @return One of the enumeration values.
    */
  def getErrorOptions(): ErrorOptions = js.native
  /**
    * Sets the type of error reporting for the error object.
    * @param value One of the enumeration values.
    */
  def setErrorOptions(value: ErrorOptions): Unit = js.native
}

object RuntimeBrokerErrorSettings {
  @scala.inline
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): RuntimeBrokerErrorSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
    __obj.asInstanceOf[RuntimeBrokerErrorSettings]
  }
  @scala.inline
  implicit class RuntimeBrokerErrorSettingsOps[Self <: RuntimeBrokerErrorSettings] (val x: Self) extends AnyVal {
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
    def setGetErrorOptions(value: () => ErrorOptions): Self = this.set("getErrorOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setSetErrorOptions(value: ErrorOptions => Unit): Self = this.set("setErrorOptions", js.Any.fromFunction1(value))
  }
  
}

