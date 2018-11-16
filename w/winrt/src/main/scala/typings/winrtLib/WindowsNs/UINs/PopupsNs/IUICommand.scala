package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUICommand extends js.Object {
  var id: js.Any = js.native
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  var label: java.lang.String = js.native
  def invoked(command: IUICommand): scala.Unit = js.native
}

