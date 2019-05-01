package typings
package twilioDashChatLib.libInterfacesTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport
  extends nodeLib.eventsMod.EventEmitter {
  val isConnected: scala.Boolean = js.native
  val state: java.lang.String = js.native
  def delete(url: java.lang.String, headers: js.Any): js.Promise[Result] = js.native
  def get(url: java.lang.String, headers: js.Any): js.Promise[Result] = js.native
  def post(url: java.lang.String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
  def put(url: java.lang.String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
}

