package typings.winrt.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUICommand extends js.Object {
  var id: js.Any = js.native
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  var label: String = js.native
  def invoked(command: IUICommand): Unit = js.native
}

