package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/providers", "IpcProvider")
@js.native
class IpcProvider () extends Provider {
  var addDefaultEvents: js.UndefOr[scala.Nothing] = js.native
  var connection: js.UndefOr[scala.Nothing] = js.native
  var notificationCallbacks: js.UndefOr[scala.Nothing] = js.native
  var responseCallbacks: js.UndefOr[scala.Nothing] = js.native
  def on(`type`: java.lang.String, callback: js.Function0[_]): js.UndefOr[scala.Nothing] = js.native
  def removeAllListeners(`type`: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def removeListener(`type`: java.lang.String, callback: js.Function0[_]): js.UndefOr[scala.Nothing] = js.native
  def reset(): js.UndefOr[scala.Nothing] = js.native
}

