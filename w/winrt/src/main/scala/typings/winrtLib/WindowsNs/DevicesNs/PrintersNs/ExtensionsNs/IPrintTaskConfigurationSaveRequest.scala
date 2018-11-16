package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrintTaskConfigurationSaveRequest extends js.Object {
  var deadline: stdLib.Date
  def cancel(): scala.Unit
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
  def save(printerExtensionContext: js.Any): scala.Unit
}

