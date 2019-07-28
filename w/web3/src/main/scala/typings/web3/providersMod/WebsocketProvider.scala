package typings.web3.providersMod

import typings.web3.Anon_E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/providers", "WebsocketProvider")
@js.native
class WebsocketProvider () extends Provider {
  var connection: Anon_E = js.native
  var notificationCallbacks: js.Array[js.Function0[_]] = js.native
  var responseCallbacks: js.Object = js.native
  def addDefaultEvents(): Unit = js.native
  def on(`type`: String, callback: js.Function0[_]): Unit = js.native
  def removeAllListeners(`type`: String): Unit = js.native
  def removeListener(`type`: String, callback: js.Function0[_]): Unit = js.native
  def reset(): Unit = js.native
}

