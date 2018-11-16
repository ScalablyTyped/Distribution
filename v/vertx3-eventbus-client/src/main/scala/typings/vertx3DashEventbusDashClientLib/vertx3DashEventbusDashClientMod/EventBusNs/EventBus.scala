package typings
package vertx3DashEventbusDashClientLib.vertx3DashEventbusDashClientMod.EventBusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBus extends js.Object {
  var options: js.UndefOr[js.Any] = js.native
  var url: java.lang.String = js.native
  def close(): js.Any = js.native
  def enablePing(enable: scala.Boolean): scala.Unit = js.native
  def enableReconnect(enable: scala.Boolean): scala.Unit = js.native
  def onclose(): js.Any = js.native
  def onerror(error: stdLib.Error): js.Any = js.native
  def onopen(): js.Any = js.native
  def publish(address: java.lang.String, message: js.Any): js.Any = js.native
  def publish(address: java.lang.String, message: js.Any, headers: js.Any): js.Any = js.native
  def registerHandler(
    address: java.lang.String,
    headers: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* message */ js.Any, _]
  ): js.Any = js.native
  def send(address: java.lang.String, message: js.Any, headers: js.Any): js.Any = js.native
  def send(
    address: java.lang.String,
    message: js.Any,
    headers: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* message */ js.Any, _]
  ): js.Any = js.native
  def unregisterHandler(
    address: java.lang.String,
    headers: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* message */ js.Any, _]
  ): js.Any = js.native
}

