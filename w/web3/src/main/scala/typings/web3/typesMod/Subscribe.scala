package typings.web3.typesMod

import typings.std.Error
import typings.web3.Anon_ArgumentsCallback
import typings.web3.web3Strings.changed
import typings.web3.web3Strings.data
import typings.web3.web3Strings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe[T] extends js.Object {
  var subscription: Anon_ArgumentsCallback[T] = js.native
  @JSName("on")
  def on_changed(`type`: changed, handler: js.Function1[/* data */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_data(`type`: data, handler: js.Function1[/* data */ T, Unit]): Unit = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[/* data */ Error, Unit]): Unit = js.native
}

