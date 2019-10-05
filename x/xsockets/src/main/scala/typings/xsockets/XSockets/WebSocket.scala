package typings.xsockets.XSockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XSockets.WebSocket")
@js.native
class WebSocket protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, subprotocol: String) = this()
  def this(url: String, subprotocol: String, settings: js.Any) = this()
  var id: String = js.native
  def many(event: String, times: Double, handler: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def many(
    event: String,
    times: Double,
    handler: js.Function1[/* data */ js.Any, Unit],
    confirmation: js.Function1[/* arg */ ConfirmationArgument, Unit]
  ): Unit = js.native
  def on(event: String, handler: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def on(
    event: String,
    handler: js.Function1[/* data */ js.Any, Unit],
    confirmation: js.Function1[/* arg */ ConfirmationArgument, Unit]
  ): Unit = js.native
  def one(event: String, handler: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def one(
    event: String,
    handler: js.Function1[/* data */ js.Any, Unit],
    confirmation: js.Function1[/* arg */ ConfirmationArgument, Unit]
  ): Unit = js.native
  def publish(topic: String, data: js.Any): Unit = js.native
  def unbind(event: String): Unit = js.native
}

