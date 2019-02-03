package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
@js.native
class Clipboard () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.Clipboard")
@js.native
object Clipboard extends js.Object {
  var oncontentchanged: js.Any = js.native
  def clear(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def getContent(): winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackageView = js.native
  def setContent(content: winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackage): scala.Unit = js.native
}

