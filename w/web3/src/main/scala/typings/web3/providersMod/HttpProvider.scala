package typings.web3.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/providers", "HttpProvider")
@js.native
class HttpProvider () extends Provider {
  var addDefaultEvents: js.UndefOr[scala.Nothing] = js.native
  var connection: js.UndefOr[scala.Nothing] = js.native
  var notificationCallbacks: js.UndefOr[scala.Nothing] = js.native
  var responseCallbacks: js.UndefOr[scala.Nothing] = js.native
  def on(`type`: String, callback: js.Function0[_]): js.UndefOr[scala.Nothing] = js.native
  def removeAllListeners(`type`: String): js.UndefOr[scala.Nothing] = js.native
  def removeListener(`type`: String, callback: js.Function0[_]): js.UndefOr[scala.Nothing] = js.native
  def reset(): js.UndefOr[scala.Nothing] = js.native
}

