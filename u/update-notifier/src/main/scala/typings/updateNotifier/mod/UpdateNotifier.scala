package typings.updateNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("update-notifier", "UpdateNotifier")
@js.native
class UpdateNotifier () extends js.Object {
  def this(settings: Settings) = this()
  val config: typings.configstore.mod.^ = js.native
  val update: js.UndefOr[UpdateInfo] = js.native
  def check(): Unit = js.native
  /** Check update information */
  def fetchInfo(): UpdateInfo | js.Promise[UpdateInfo] = js.native
  def notify(customMessage: NotifyOptions): Unit = js.native
}

