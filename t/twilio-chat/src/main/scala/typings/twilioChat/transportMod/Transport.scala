package typings.twilioChat.transportMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends EventEmitter {
  val isConnected: Boolean = js.native
  val state: String = js.native
  def delete(url: String, headers: js.Any): js.Promise[Result] = js.native
  def get(url: String, headers: js.Any): js.Promise[Result] = js.native
  def post(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
  def put(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
}

