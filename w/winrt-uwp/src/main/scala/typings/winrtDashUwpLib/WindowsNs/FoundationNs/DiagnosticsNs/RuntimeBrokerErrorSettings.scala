package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents diagnostic error reporting settings. */
@JSGlobal("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings")
@js.native
class RuntimeBrokerErrorSettings () extends js.Object {
  /**
                   * Gets the type of error reporting for the error object.
                   * @return One of the enumeration values.
                   */
  def getErrorOptions(): ErrorOptions = js.native
  /**
                   * Sets the type of error reporting for the error object.
                   * @param value One of the enumeration values.
                   */
  def setErrorOptions(value: ErrorOptions): scala.Unit = js.native
}

