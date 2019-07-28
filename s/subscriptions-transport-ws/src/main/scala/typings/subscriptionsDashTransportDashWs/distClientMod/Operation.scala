package typings.subscriptionsDashTransportDashWs.distClientMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  var options: OperationOptions = js.native
  def handler(error: js.Array[Error]): Unit = js.native
  def handler(error: js.Array[Error], result: js.Any): Unit = js.native
}

