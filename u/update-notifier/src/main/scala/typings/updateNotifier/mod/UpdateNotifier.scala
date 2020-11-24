package typings.updateNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("update-notifier", "UpdateNotifier")
@js.native
class UpdateNotifier () extends js.Object {
  def this(settings: Settings) = this()
  
  def check(): Unit = js.native
  
  val config: typings.configstore.mod.^ = js.native
  
  /**
    * Check update information
    * @async
    */
  def fetchInfo(): UpdateInfo | js.Promise[UpdateInfo] = js.native
  
  def notify(customMessage: NotifyOptions): Unit = js.native
  
  val update: js.UndefOr[UpdateInfo] = js.native
}
