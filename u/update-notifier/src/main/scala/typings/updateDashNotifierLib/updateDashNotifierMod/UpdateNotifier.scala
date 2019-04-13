package typings
package updateDashNotifierLib.updateDashNotifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("update-notifier", "UpdateNotifier")
@js.native
class UpdateNotifier () extends js.Object {
  def this(settings: Settings) = this()
  var update: js.UndefOr[UpdateInfo] = js.native
  def check(): scala.Unit = js.native
  def checkNpm(): scala.Unit = js.native
  def notify(customMessage: NotifyOptions): scala.Unit = js.native
}

