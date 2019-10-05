package typings.winrt.Windows.ApplicationModel.DataTransfer

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
  def clear(): Unit = js.native
  def flush(): Unit = js.native
  def getContent(): DataPackageView = js.native
  def setContent(content: DataPackage): Unit = js.native
}

