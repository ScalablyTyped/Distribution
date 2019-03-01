package typings
package winrtLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorReportingSettings extends js.Object {
  def getErrorOptions(): ErrorOptions
  def setErrorOptions(value: ErrorOptions): scala.Unit
}

object IErrorReportingSettings {
  @scala.inline
  def apply(
    getErrorOptions: js.Function0[ErrorOptions],
    setErrorOptions: js.Function1[ErrorOptions, scala.Unit]
  ): IErrorReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getErrorOptions")(getErrorOptions)
    __obj.updateDynamic("setErrorOptions")(setErrorOptions)
    __obj.asInstanceOf[IErrorReportingSettings]
  }
}

