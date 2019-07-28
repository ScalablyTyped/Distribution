package typings.web3.typesMod

import typings.std.Error
import typings.web3.web3Strings.changed
import typings.web3.web3Strings.data
import typings.web3.web3Strings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  @JSName("on")
  def on_changed(
    `type`: changed,
    handler: js.Function1[Error | (/* receipt */ EventLog) | String | TransactionReceipt, Unit]
  ): EventEmitter = js.native
  @JSName("on")
  def on_data(
    `type`: data,
    handler: js.Function1[Error | (/* event */ EventLog) | String | TransactionReceipt, Unit]
  ): EventEmitter = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[(/* error */ Error) | String | TransactionReceipt, Unit]): EventEmitter = js.native
}

