package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents diagnostic error reporting settings. */
@JSGlobal("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings")
@js.native
/** Creates and initializes a new instance of the RuntimeBrokerErrorSettings . */
class RuntimeBrokerErrorSettings ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings {
  /**
    * Gets the type of error reporting for the error object.
    * @return One of the enumeration values.
    */
  /* CompleteClass */
  override def getErrorOptions(): typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions = js.native
  /**
    * Sets the type of error reporting for the error object.
    * @param value One of the enumeration values.
    */
  /* CompleteClass */
  override def setErrorOptions(value: typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions): Unit = js.native
}

