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
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => scala.Unit): IErrorReportingSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
  
    __obj.asInstanceOf[IErrorReportingSettings]
  }
}

