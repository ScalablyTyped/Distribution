package typings
package twilioDashChatLib.libServicesNetworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/services/network", "Network")
@js.native
class Network protected () extends js.Object {
  def this(config: js.Any, services: js.Any) = this()
  var backoffConfig: js.Any = js.native
  val cache: js.Any = js.native
  var cacheLifetime: js.Any = js.native
  var cleanupCache: js.Any = js.native
  val config: js.Any = js.native
  var executeWithRetry: js.Any = js.native
  var isExpired: js.Any = js.native
  var retryWhenThrottled: js.Any = js.native
  val services: js.Any = js.native
  var timer: js.Any = js.native
  def get(url: java.lang.String): js.Promise[_] = js.native
  def pokeTimer(): scala.Unit = js.native
}

