package typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryProtocolInterface extends js.Object {
  val chunk: String
  def close(): Unit
  def on(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit
  def send(data: String): Unit
  def sendKeepAlive(): Unit
}

object QueryProtocolInterface {
  @scala.inline
  def apply(
    chunk: String,
    close: () => Unit,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    send: String => Unit,
    sendKeepAlive: () => Unit
  ): QueryProtocolInterface = {
    val __obj = js.Dynamic.literal(chunk = chunk, close = js.Any.fromFunction0(close), on = js.Any.fromFunction2(on), send = js.Any.fromFunction1(send), sendKeepAlive = js.Any.fromFunction0(sendKeepAlive))
  
    __obj.asInstanceOf[QueryProtocolInterface]
  }
}

