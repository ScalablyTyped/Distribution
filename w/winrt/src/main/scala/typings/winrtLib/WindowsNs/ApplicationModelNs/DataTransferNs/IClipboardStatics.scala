package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClipboardStatics extends js.Object {
  var oncontentchanged: js.Any
  def clear(): scala.Unit
  def flush(): scala.Unit
  def getContent(): DataPackageView
  def setContent(content: DataPackage): scala.Unit
}

