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
    clear: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getContent: js.Function0[DataPackageView],
    oncontentchanged: js.Any,
    setContent: js.Function1[DataPackage, scala.Unit]
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = clear, flush = flush, getContent = getContent, oncontentchanged = oncontentchanged, setContent = setContent)
  
    __obj.asInstanceOf[IClipboardStatics]
  }
}

