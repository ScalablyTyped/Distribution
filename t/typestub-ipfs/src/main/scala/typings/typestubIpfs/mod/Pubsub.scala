package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pubsub extends js.Object {
  def ls(): js.Promise[_] = js.native
  def ls(callback: Callback[_]): Unit = js.native
  def peers(topic: js.Any): js.Promise[_] = js.native
  def peers(topic: js.Any, callback: Callback[_]): Unit = js.native
  def publish(topic: js.Any, data: js.Any): js.Promise[_] = js.native
  def publish(topic: js.Any, data: js.Any, callback: Callback[_]): Unit = js.native
  def setMaxListeners(n: Double): js.Any = js.native
  def subscribe(topic: js.Any, handler: js.Any, options: js.Any): js.Promise[Unit] = js.native
  def subscribe(topic: js.Any, handler: js.Any, options: js.Any, callback: Callback[_]): Unit = js.native
  def unsubscribe(topic: js.Any, handler: js.Any): js.Promise[Unit] = js.native
  def unsubscribe(topic: js.Any, handler: js.Any, callback: Callback[Unit]): Unit = js.native
}

