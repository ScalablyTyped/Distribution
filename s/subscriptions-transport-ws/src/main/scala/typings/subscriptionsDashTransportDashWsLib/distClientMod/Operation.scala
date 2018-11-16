package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  var options: OperationOptions = js.native
  def handler(error: js.Array[nodeLib.Error]): scala.Unit = js.native
  def handler(error: js.Array[nodeLib.Error], result: js.Any): scala.Unit = js.native
}

