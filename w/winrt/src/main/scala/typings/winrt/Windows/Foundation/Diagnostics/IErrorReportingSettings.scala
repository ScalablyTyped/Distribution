package typings.winrt.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorReportingSettings extends js.Object {
  def getErrorOptions(): ErrorOptions
  def setErrorOptions(value: ErrorOptions): Unit
}

object IErrorReportingSettings {
  @scala.inline
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): IErrorReportingSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
    __obj.asInstanceOf[IErrorReportingSettings]
  }
}

