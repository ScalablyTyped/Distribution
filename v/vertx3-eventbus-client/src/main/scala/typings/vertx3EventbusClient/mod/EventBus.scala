package typings.vertx3EventbusClient.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBus extends js.Object {
  
  def close(): js.Any = js.native
  
  def enablePing(enable: Boolean): Unit = js.native
  
  def enableReconnect(enable: Boolean): Unit = js.native
  
  def onclose(): js.Any = js.native
  
  def onerror(error: Error): js.Any = js.native
  
  def onopen(): js.Any = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  def publish(address: String, message: js.Any): js.Any = js.native
  def publish(address: String, message: js.Any, headers: js.Any): js.Any = js.native
  
  def registerHandler(address: String): js.Any = js.native
  def registerHandler(
    address: String,
    headers: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
  ): js.Any = js.native
  def registerHandler(address: String, headers: js.Object): js.Any = js.native
  def registerHandler(
    address: String,
    headers: js.Object,
    callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
  ): js.Any = js.native
  
  def send(address: String, message: js.Any): js.Any = js.native
  def send(
    address: String,
    message: js.Any,
    headers: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
  ): js.Any = js.native
  def send(address: String, message: js.Any, headers: js.Object): js.Any = js.native
  def send(
    address: String,
    message: js.Any,
    headers: js.Object,
    callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
  ): js.Any = js.native
  
  def unregisterHandler(address: String): js.Any = js.native
  def unregisterHandler(
    address: String,
    headers: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
  ): js.Any = js.native
  def unregisterHandler(address: String, headers: js.Object): js.Any = js.native
  def unregisterHandler(
    address: String,
    headers: js.Object,
    callback: js.Function2[/* error */ Error, /* message */ js.Any, _]
  ): js.Any = js.native
  
  var url: String = js.native
}
