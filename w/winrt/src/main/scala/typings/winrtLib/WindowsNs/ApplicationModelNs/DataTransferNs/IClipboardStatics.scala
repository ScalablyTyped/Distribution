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

object IClipboardStatics {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    flush: () => scala.Unit,
    getContent: () => DataPackageView,
    oncontentchanged: js.Any,
    setContent: DataPackage => scala.Unit
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getContent = js.Any.fromFunction0(getContent), oncontentchanged = oncontentchanged, setContent = js.Any.fromFunction1(setContent))
  
    __obj.asInstanceOf[IClipboardStatics]
  }
}

