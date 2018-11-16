package typings
package xsocketsLib.XSocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XSockets.WebSocket")
@js.native
class WebSocket protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, subprotocol: java.lang.String) = this()
  def this(url: java.lang.String, subprotocol: java.lang.String, settings: js.Any) = this()
  var id: java.lang.String = js.native
  def many(event: java.lang.String, times: scala.Double, handler: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def many(
    event: java.lang.String,
    times: scala.Double,
    handler: js.Function1[/* data */ js.Any, scala.Unit],
    confirmation: js.Function1[/* arg */ ConfirmationArgument, scala.Unit]
  ): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(
    event: java.lang.String,
    handler: js.Function1[/* data */ js.Any, scala.Unit],
    confirmation: js.Function1[/* arg */ ConfirmationArgument, scala.Unit]
  ): scala.Unit = js.native
  def one(event: java.lang.String, handler: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def one(
    event: java.lang.String,
    handler: js.Function1[/* data */ js.Any, scala.Unit],
    confirmation: js.Function1[/* arg */ ConfirmationArgument, scala.Unit]
  ): scala.Unit = js.native
  def publish(topic: java.lang.String, data: js.Any): scala.Unit = js.native
  def unbind(event: java.lang.String): scala.Unit = js.native
}

