package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClipboardStatics extends js.Object {
  var oncontentchanged: js.Any
  def clear(): Unit
  def flush(): Unit
  def getContent(): DataPackageView
  def setContent(content: DataPackage): Unit
}

object IClipboardStatics {
  @scala.inline
  def apply(
    clear: () => Unit,
    flush: () => Unit,
    getContent: () => DataPackageView,
    oncontentchanged: js.Any,
    setContent: DataPackage => Unit
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getContent = js.Any.fromFunction0(getContent), oncontentchanged = oncontentchanged.asInstanceOf[js.Any], setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[IClipboardStatics]
  }
}

