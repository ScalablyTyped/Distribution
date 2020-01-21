package typings.web3Shh.mod

import typings.std.Error
import typings.web3Shh.web3ShhStrings.data
import typings.web3Shh.web3ShhStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  @JSName("on")
  def on_data(`type`: data, handler: js.Function1[/* data */ Notification, Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[/* data */ Error, Unit]): Unit = js.native
}

