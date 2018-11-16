package typings
package updateDashNotifierLib.updateDashNotifierMod.UpdateNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotifier extends js.Object {
  var update: js.UndefOr[UpdateInfo] = js.native
  def check(): scala.Unit = js.native
  def checkNpm(): scala.Unit = js.native
  def notify(customMessage: NotifyOptions): scala.Unit = js.native
}

