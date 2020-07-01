package typings.systemService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("system-service", "MessageConsumer")
@js.native
class MessageConsumer () extends js.Object {
  var logger: typings.systemLogger.mod.Logger = js.native
  def cleanup(): Unit = js.native
  def create(): Unit = js.native
  def process(message: js.Any): Unit = js.native
  def service(): Unit = js.native
  def setup(systemService: SystemService): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def validate(message: js.Any): Unit = js.native
}

