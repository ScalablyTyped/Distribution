package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/providers", "WebsocketProvider")
@js.native
class WebsocketProvider () extends Provider {
  var connection: web3Lib.Anon_E = js.native
  var notificationCallbacks: js.Array[js.Function0[_]] = js.native
  var responseCallbacks: js.Object = js.native
  def addDefaultEvents(): scala.Unit = js.native
  def on(`type`: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def removeAllListeners(`type`: java.lang.String): scala.Unit = js.native
  def removeListener(`type`: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

